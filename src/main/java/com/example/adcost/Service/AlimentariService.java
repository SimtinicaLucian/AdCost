package com.example.adcost.Service;


import com.example.adcost.model.Alimentari;
import com.example.adcost.repository.AlimentariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentariService {

    @Autowired
    private AlimentariRepository alimentariRepository;




    public Alimentari updateAlimentare(int number, Alimentari alimentari){
        List<Alimentari> numberSearch = alimentariRepository.findByNumber(number);
          Alimentari search = numberSearch.get(0);
            search.setData(alimentari.getData());
            search.setFurnizor(alimentari.getFurnizor());
            search.setNumber(alimentari.getNumber());
            search.setAuto(alimentari.getAuto());
            search.setSumaTotala(alimentari.getSumaTotala());
            search.setLitri(alimentari.getLitri());

            search = alimentariRepository.save(search);

            return search;


// commit






        }



}