package com.example.adcost.Service;


import com.example.adcost.model.Alimentari;
import com.example.adcost.repository.AlimentariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlimentariService {

    @Autowired
    private AlimentariRepository alimentariRepository;


    public Alimentari saveAlimentare(Alimentari alimentari) {
        List<Alimentari> alimentareSearch = alimentariRepository.findByNumber(alimentari.getNumber());

        if (alimentareSearch.size() >= 1) {
//            return null;

            Alimentari search = alimentareSearch.get(0);
            search.setData(alimentari.getData());
            search.setFurnizor(alimentari.getFurnizor());
            search.setNumber(alimentari.getNumber());
            search.setAuto(alimentari.getAuto());
            search.setSumaTotala(alimentari.getSumaTotala());
            search.setLitri(alimentari.getLitri());
            alimentariRepository.deleteByNumber(alimentari.getNumber());
            alimentari = alimentariRepository.save(search);


            return alimentari;


        }

        alimentari = alimentariRepository.save(alimentari);

        return alimentari;
    }




    public List<Alimentari> searchAll(){
        List<Alimentari> alimentariList = alimentariRepository.findAll();
        if(alimentariList.size() > 0){
            return alimentariList;
        }else{
            return null;
        }
    }

    public List<Alimentari> searchByData(String data) {
        List<Alimentari> searchData = alimentariRepository.findByData(data);
        return searchData;
    }



    public List<Alimentari> searchByNumber(int number) {
        List<Alimentari> searchNumber = alimentariRepository.findByNumber(number);
        return searchNumber;
    }

    public List<Alimentari> searchByAuto(String auto) {
        List<Alimentari> searchAuto = alimentariRepository.findByAuto(auto);
        return searchAuto;
    }


    public List<Alimentari> searchByFurnizor(String furnizor) {
        List<Alimentari> searchFurnizor = alimentariRepository.findByFurnizor(furnizor);
        return searchFurnizor;
    }


    public List<Alimentari>  deleteByNumber(int number) {
        List<Alimentari> deleteNumber = alimentariRepository.findByNumber(number);
        if (deleteNumber.size() >= 1) {
            alimentariRepository.deleteByNumber(number);
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