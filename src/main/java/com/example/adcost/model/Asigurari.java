package com.example.adcost.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter


@Document(collection = "Asigurari")
public class Asigurari {

    private String data;
    private String Furnizor;
    private int politaNr;
    private String auto;
    private double sumaTotala;
}


