package com.example.adcost.resource;
import com.example.adcost.Service.ServiceService;
import com.example.adcost.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/service/")
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceResource {

    @Autowired

    private ServiceService serviceService;


    @PostMapping(value = "/add")
    public Service persist(@RequestBody final Service service){
        return serviceService.saveReparatie(service);


    }


    @GetMapping(value = "/searchAll")
    public List<Service> searchAll(){
        return serviceService.searchAll();
    }


    @GetMapping(value ="/search/data/{data}")
    public List<Service> searchByData(@PathVariable  String data){
        return serviceService.searchByData(data);
    }


    @GetMapping(value ="/search/number/{number}")
    public List<Service> searchByNumber(@PathVariable  int number){
        return serviceService.searchByNumber(number);
    }


    @GetMapping(value ="/search/auto/{auto}")
    public List<Service> searchByAuto(@PathVariable  String auto){

        return serviceService.searchByAuto(auto);
    }


    @GetMapping(value ="/search/furnizor/{furnizor}")
    public List<Service> searchByFurnizor(@PathVariable  String furnizor){
        return serviceService.searchByFurnizor(furnizor);
    }


    @DeleteMapping(value ="/delete/{number}")
    public void deleteByNumber(@PathVariable  int number){
        serviceService.deleteByNumber(number);
    }


//    @PutMapping(value ="/update/{number}")
//    public Alimentari updateAlimentare(@PathVariable int number, @RequestBody Alimentari alimentari){
//        return alimService.updateAlimentare(number, alimentari);
//
//    }


}
