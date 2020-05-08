package com.example.adcost.repository;

import com.example.adcost.model.Asigurari;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;


public interface AsigurariRepository extends MongoRepository<Asigurari, String> {
    List<Asigurari> findByData(String data);
    List<Asigurari> findByNumber(int number);
    void deleteByNumber(int number);
    List<Asigurari> findByFurnizor(String furnizor);
    List<Asigurari> findByAuto(String auto);

}

