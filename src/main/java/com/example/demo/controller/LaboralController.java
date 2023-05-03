package com.example.demo.controller;

import com.example.demo.model.Laboral;
import com.example.demo.service.ILaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laboral")
@CrossOrigin(origins = "http://localhost:4200")
public class LaboralController {
    
    @Autowired
    private ILaboralService persoServ;
    
    @PostMapping
    public void agregarLabor (@RequestBody Laboral pers){
        persoServ.crearLabor(pers);
    }
    
    @GetMapping
    @ResponseBody
    public List<Laboral> verLabor (){
        return persoServ.verLabor();
    }
    
    @DeleteMapping("/{idtrabajo}")
    public void borrarLabor (@PathVariable("idtrabajo") long idtrabajo){
        persoServ.borrarLabor(idtrabajo);
    }
    
    @PutMapping
    public void modifLabor (@PathVariable Laboral pers){
        persoServ.modifLabor(pers);   
    }
       
}