package com.example.adcost.resource;
import com.example.adcost.Service.AsigurariService;
import com.example.adcost.model.Asigurari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/asigurari/")
@CrossOrigin(origins = "http://localhost:4200")
public class AsigurariResource {

    @Autowired

    private AsigurariService asigurariService;


    @PostMapping(value = "/add")
    public Asigurari persist(@RequestBody final  Asigurari asigurari){
        return asigurariService.saveAsigurare(asigurari);


    }


    @GetMapping(value = "/searchAll")
    public List<Asigurari> searchAll(){
        return asigurariService.searchAll();
    }


    @GetMapping(value ="/search/data/{data}")
    public List<Asigurari> searchByData(@PathVariable  String data){
        return asigurariService.searchByData(data);
    }


    @GetMapping(value ="/search/number/{number}")
    public List<Asigurari> searchByNumber(@PathVariable  int number){
        return asigurariService.searchByNumber(number);
    }


    @GetMapping(value ="/search/auto/{auto}")
    public List<Asigurari> searchByAuto(@PathVariable  String auto){

        return asigurariService.searchByAuto(auto);
    }


    @GetMapping(value ="/search/furnizor/{furnizor}")
    public List<Asigurari> searchByFurnizor(@PathVariable  String furnizor){
        return asigurariService.searchByFurnizor(furnizor);
    }


    @DeleteMapping(value ="/delete/{number}")
    public void deleteByNumber(@PathVariable  int number){
        asigurariService.deleteByNumber(number);
    }


//    @PutMapping(value ="/update/{number}")
//    public Alimentari updateAlimentare(@PathVariable int number, @RequestBody Alimentari alimentari){
//        return alimService.updateAlimentare(number, alimentari);
//
//    }


}
