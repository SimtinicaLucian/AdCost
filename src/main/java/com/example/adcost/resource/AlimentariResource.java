package com.example.adcost.resource;
import com.example.adcost.Service.AlimentariService;
import com.example.adcost.Service.AlimentariService;
import com.example.adcost.model.Alimentari;
import com.example.adcost.repository.AlimentariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@RestController
//@RequestMapping(value = "/rest/users")
//public class ProductResource {
//
//    @Autowired
//    ProductRepository productRepository;
//
//    @GetMapping(value = "/all")
//    public List<Cheltuieli> getAll(){
//        return productRepository.findAll();
//    }
//
//    @GetMapping(value ="/search/{id}")
//    public Optional<Cheltuieli> findByName(@PathVariable final Integer id){
//        return productRepository.findById(id);
//    }
//
//    @PostMapping(value = "/load")
//    public List<Cheltuieli> persist(@RequestBody final Cheltuieli cheltuieli){
//        productRepository.save(cheltuieli);
//        return productRepository.findAll();
//    }
//

@RestController
@RequestMapping(value = "/alimentari/")
public class AlimentariResource {

    @Autowired
    private AlimentariRepository alimentariRepository;
//    private AlimentariService factService;


    @PostMapping("/add")
    public List<Alimentari> saveAlimentare(@RequestBody Alimentari alimentari) {

        List<Alimentari> listSearch = searchByNumber(alimentari.getNumber());
        if(listSearch.size() >= 1){
            return null;
        }

        alimentariRepository.save(alimentari);

        return alimentariRepository.findAll();
    }

    @GetMapping("/searchAll")
    public List<Alimentari> getAlimentari() {
        return alimentariRepository.findAll();
    }

    @GetMapping("/search/data/{data}")
    public List<Alimentari> searchByData(@PathVariable String data) {
        List<Alimentari> alimentariList = alimentariRepository.findByData(data);
        return alimentariList;
    }

    @GetMapping("/search/number/{number}")
    public List<Alimentari> searchByNumber(@PathVariable int number) {
        List<Alimentari> alimentariList = alimentariRepository.findByNumber(number);
        return alimentariList;
    }

    @DeleteMapping("/delete/number/{number}")
    public void deleteNumber(@PathVariable int number) {

        alimentariRepository.deleteByNumber(number);
    }

//    @PutMapping(value ="/update/{number}")
//    public Alimentari updateAlimentare(@PathVariable int number, @RequestBody Alimentari alimentari){
//        return factService.updateAlimentare(number, alimentari);
//
//    }

    // commit






}
