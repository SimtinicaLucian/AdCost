package com.example.dfitness.resource;
import com.example.dfitness.model.Cheltuieli;
import com.example.dfitness.repository.ProductRepository;
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
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Cheltuieli cheltuieli) {
        productRepository.save(cheltuieli);
        return "Added book with id : " ;
    }

    @GetMapping("/findAllBooks")
    public List<Cheltuieli> getBooks() {
        return productRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Cheltuieli> getBook(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        productRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

}
