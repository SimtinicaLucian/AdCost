package com.example.adcost.repository;

import com.example.adcost.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ServiceRepository extends MongoRepository<Service, String> {
    List<Service> findByData(String data);
    List<Service> findByNumber(int number);
    void deleteByNumber(int number);
    List<Service> findByFurnizor(String furnizor);
    List<Service> findByAuto(String auto);

}

