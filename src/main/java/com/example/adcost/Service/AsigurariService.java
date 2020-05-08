package com.example.adcost.Service;


import com.example.adcost.model.Asigurari;
import com.example.adcost.repository.AsigurariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AsigurariService {

    @Autowired
    private AsigurariRepository asigurariRepository;


    public Asigurari saveAsigurare(Asigurari asigurari) {
        List<Asigurari> asigurareSearch = asigurariRepository.findByNumber(asigurari.getNumber());

        if (asigurareSearch.size() >= 1) {
//            return null;

            Asigurari search = asigurareSearch.get(0);
            search.setData(asigurari.getData());
            search.setFurnizor(asigurari.getFurnizor());
            search.setNumber(asigurari.getNumber());
            search.setAuto(asigurari.getAuto());
            search.setDescriere(asigurari.getDescriere());
            search.setSumaTotala(asigurari.getSumaTotala());
            search.setSumaFaraTVA(asigurari.getSumaFaraTVA());
            search.setSumaTVA(asigurari.getSumaTVA());

            asigurariRepository.deleteByNumber(asigurari.getNumber());
            asigurari = asigurariRepository.save(search);


            return asigurari;


        }

        asigurari = asigurariRepository.save(asigurari);

        return asigurari;
    }




    public List<Asigurari> searchAll(){
        List<Asigurari> alimentariList = asigurariRepository.findAll();
        if(alimentariList.size() > 0){
            return alimentariList;
        }else{
            return null;
        }
    }

    public List<Asigurari> searchByData(String data) {
        List<Asigurari> searchData = asigurariRepository.findByData(data);
        return searchData;
    }



    public List<Asigurari> searchByNumber(int number) {
        List<Asigurari> searchNumber = asigurariRepository.findByNumber(number);
        return searchNumber;
    }

    public List<Asigurari> searchByAuto(String auto) {
        List<Asigurari> searchAuto = asigurariRepository.findByAuto(auto);
        return searchAuto;
    }


    public List<Asigurari> searchByFurnizor(String furnizor) {
        List<Asigurari> searchFurnizor = asigurariRepository.findByFurnizor(furnizor);
        return searchFurnizor;
    }


    public List<Asigurari>  deleteByNumber(int number) {
        List<Asigurari> deleteNumber = asigurariRepository.findByNumber(number);
        if (deleteNumber.size() >= 1) {
            asigurariRepository.deleteByNumber(number);
        }
        return deleteNumber;

    }


//    public Alimentari updateAlimentare(int number, Alimentari alimentari){
//        List<Alimentari> numberSearch = alimentariRepository.findByNumber(number);
//        Alimentari search = numberSearch.get(0);
//        search.setData(alimentari.getData());
//        search.setFurnizor(alimentari.getFurnizor());
//        search.setNumber(alimentari.getNumber());
//        search.setAuto(alimentari.getAuto());
//        search.setSumaTotala(alimentari.getSumaTotala());
//        search.setLitri(alimentari.getLitri());
//
//        search = alimentariRepository.save(search);
//        alimentariRepository.deleteByNumber(number);
//
//
//        return search;
//
//
//
//
//
//
//
//
//    }



}