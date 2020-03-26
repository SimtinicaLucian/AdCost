package com.example.dfitness.repository;

import com.example.dfitness.model.Cheltuieli;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Cheltuieli, Integer> {
}
