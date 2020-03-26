package com.example.adcost.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@ToString


@Document(collection = "Cheltuieli")
public class Cheltuieli {

        @Id

        private String nume;
        private String prenume;



}
