package com.example.adcost.resource;
import com.example.adcost.model.Cheltuieli;
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
@RequestMapping(value = "/cheltuieli/")
public class CheltuieliResource {

    @Autowired
    private CheltuieliRepository cheltuieliRepository;

    @PostMapping("/addBook")
    public List<Cheltuieli> saveBook(@RequestBody Cheltuieli cheltuieli) {
        cheltuieliRepository.save(cheltuieli);
        return cheltuieliRepository.findAll();
    }

    @GetMapping("/findAllBooks")
    public List<Cheltuieli> getBooks() {
        return cheltuieliRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Cheltuieli> getBook(@PathVariable String id) {
        return cheltuieliRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        cheltuieliRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

}
