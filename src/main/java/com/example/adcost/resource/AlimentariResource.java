package com.example.adcost.resource;
import com.example.adcost.Service.AlimentariService;
import com.example.adcost.model.Alimentari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/alimentari/")
public class AlimentariResource {

    @Autowired

    private AlimentariService alimService;


    @PostMapping(value = "/add")
    public Alimentari persist(@RequestBody final  Alimentari alimentari){
        return alimService.saveAlimentare(alimentari);
    }


    @GetMapping(value = "/searchAll")
    public List<Alimentari> searchAll(){
        return alimService.searchAll();
    }


    @GetMapping(value ="/search/data/{data}")
    public List<Alimentari> searchByData(@PathVariable  String data){
        return alimService.searchByData(data);
    }


    @GetMapping(value ="/search/number/{number}")
    public List<Alimentari> searchByNumber(@PathVariable  int number){
        return alimService.searchByNumber(number);
    }


    @GetMapping(value ="/search/auto/{auto}")
    public List<Alimentari> searchByAuto(@PathVariable  String auto){

        return alimService.searchByAuto(auto);
    }


    @GetMapping(value ="/search/furnizor/{furnizor}")
    public List<Alimentari> searchByFurnizor(@PathVariable  String furnizor){
        return alimService.searchByFurnizor(furnizor);
    }


    @DeleteMapping("/delete/number/{number}")
    public void deleteByNumber(@PathVariable  int number){
         alimService.deleteByNumber(number);
    }


        @PutMapping(value ="/update/{number}")
    public Alimentari updateAlimentare(@PathVariable int number, @RequestBody Alimentari alimentari){
        return alimService.updateAlimentare(number, alimentari);

    }


}
