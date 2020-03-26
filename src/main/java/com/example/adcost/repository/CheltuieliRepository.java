package com.example.adcost.repository;

        import com.example.adcost.model.Cheltuieli;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface CheltuieliRepository extends MongoRepository<Cheltuieli, String> {
}
