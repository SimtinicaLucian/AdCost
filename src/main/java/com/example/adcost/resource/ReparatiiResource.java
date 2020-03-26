package com.example.adcost.resource;
import com.example.adcost.model.Alimentari;
import com.example.adcost.model.Cheltuieli;
import com.example.adcost.model.Reparatii;
import com.example.adcost.repository.AlimentariRepository;
import com.example.adcost.repository.CheltuieliRepository;
import com.example.adcost.repository.ReparatiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/reparatii/")
public class ReparatiiResource {

    @Autowired
    private ReparatiiRepository reparatiiRepository;

    @PostMapping("/addBook")
    public List<Reparatii> saveBook(@RequestBody Reparatii reparatii) {
        reparatiiRepository.save(reparatii);
        return reparatiiRepository.findAll();
    }

    @GetMapping("/findAllBooks")
    public List<Reparatii> getBooks() {
        return reparatiiRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Reparatii> getBook(@PathVariable String id) {
        return reparatiiRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        reparatiiRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

}
