package com.example.adcost.resource;
import com.example.adcost.model.Alimentari;
import com.example.adcost.model.Cheltuieli;
import com.example.adcost.repository.AlimentariRepository;
import com.example.adcost.repository.CheltuieliRepository;
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
@RequestMapping(value = "/alimentari/")
public class AlimentariResource {

    @Autowired
    private AlimentariRepository alimentariRepository;

    @PostMapping("/addBook")
    public List<Alimentari> saveBook(@RequestBody Alimentari alimentari) {
        alimentariRepository.save(alimentari);
        return alimentariRepository.findAll();
    }

    @GetMapping("/findAllBooks")
    public List<Alimentari> getBooks() {
        return alimentariRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Alimentari> getBook(@PathVariable String id) {
        return alimentariRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        alimentariRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

}
