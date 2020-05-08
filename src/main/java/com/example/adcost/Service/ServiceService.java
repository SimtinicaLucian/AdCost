package com.example.adcost.Service;


import com.example.adcost.model.Service;
import com.example.adcost.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;


    public Service saveReparatie(Service service) {
        List<Service> reparatieSearch = serviceRepository.findByNumber(service.getNumber());

        if (reparatieSearch.size() >= 1) {
//            return null;

            Service search = reparatieSearch.get(0);
            search.setData(service.getData());
            search.setFurnizor(service.getFurnizor());
            search.setNumber(service.getNumber());
            search.setAuto(service.getAuto());
            search.setSumaTotala(service.getSumaTotala());
            search.setDescriere(service.getDescriere());
            search.setSumaFaraTVA(service.getSumaFaraTVA());
            search.setSumaTVA(service.getSumaTVA());
            serviceRepository.deleteByNumber(service.getNumber());
            service = serviceRepository.save(search);


            return service;


        }

        service = serviceRepository.save(service);

        return service;
    }




    public List<Service> searchAll(){
        List<Service> serviceList = serviceRepository.findAll();
        if(serviceList.size() > 0){
            return serviceList;
        }else{
            return null;
        }
    }

    public List<Service> searchByData(String data) {
        List<Service> searchData = serviceRepository.findByData(data);
        return searchData;
    }



    public List<Service> searchByNumber(int number) {
        List<Service> searchNumber = serviceRepository.findByNumber(number);
        return searchNumber;
    }

    public List<Service> searchByAuto(String auto) {
        List<Service> searchAuto = serviceRepository.findByAuto(auto);
        return searchAuto;
    }


    public List<Service> searchByFurnizor(String furnizor) {
        List<Service> searchFurnizor = serviceRepository.findByFurnizor(furnizor);
        return searchFurnizor;
    }


    public List<Service>  deleteByNumber(int number) {
        List<Service> deleteNumber = serviceRepository.findByNumber(number);
        if (deleteNumber.size() >= 1) {
            serviceRepository.deleteByNumber(number);
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