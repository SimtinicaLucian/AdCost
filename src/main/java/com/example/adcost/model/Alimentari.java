package com.example.adcost.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter


@Document(collection = "Alimentari")
public class Alimentari {

    //@JsonFormat (shape = JsonFormat.Shape.STRING , pattern = "yyyy-MM-dd")
    private String data;
    private String furnizor;
    private int number;
    private String auto;
    private double sumaTotala;
    private double litri;

    public int getNumber(){
        return number;
    }

    public String getData(){
        return data;
    }

    public String getFurnizor(){
        return furnizor;
    }

    public String getAuto(){
        return auto;
    }

    public double getSumaTotala(){
        return sumaTotala;
    }

    public double getLitri(){
        return litri;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFurnizor(String furnizor) {
        this.furnizor = furnizor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public void setLitri(double litri) {
        this.litri = litri;
    }


}

// commit

