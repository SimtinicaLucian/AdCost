package com.example.adcost.repository;

import com.example.adcost.model.Alimentari;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlimentariRepository extends MongoRepository<Alimentari, String> {
}
