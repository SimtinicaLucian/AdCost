package com.example.adcost.repository;

import com.example.adcost.model.Asigurari;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsigurariRepository extends MongoRepository<Asigurari, String> {
}
