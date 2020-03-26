package com.example.adcost.resource;
import com.example.adcost.model.Alimentari;
import com.example.adcost.model.Asigurari;
import com.example.adcost.model.Cheltuieli;
import com.example.adcost.repository.AlimentariRepository;
import com.example.adcost.repository.AsigurariRepository;
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
@RequestMapping(value = "/asigurari/")
public class AsigurariResource {

    @Autowired
    private AsigurariRepository asigurariRepository;

    @PostMapping("/addBook")
    public List<Asigurari> saveBook(@RequestBody Asigurari asigurari) {
        asigurariRepository.save(asigurari);
        return asigurariRepository.findAll();
    }

    @GetMapping("/findAllBooks")
    public List<Asigurari> getBooks() {
        return asigurariRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Asigurari> getBook(@PathVariable String id) {
        return asigurariRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        asigurariRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

}
