package com.example.adcost.repository;

import com.example.adcost.model.Alimentari;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;


public interface AlimentariRepository extends MongoRepository<Alimentari, String> {
    List<Alimentari> findByData(String data);
    List<Alimentari> findByNumber(int number);
    void deleteByNumber(int number);

}

// commit