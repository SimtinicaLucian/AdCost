package com.example.adcost.repository;

        import com.example.adcost.model.Reparatii;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReparatiiRepository extends MongoRepository<Reparatii, String> {
}
