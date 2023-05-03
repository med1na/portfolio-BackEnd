package com.example.demo.controller;

import com.example.demo.model.Habilidad;
import com.example.demo.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
    
    @Autowired
    private IHabilidadService persoServ;
    
    @PostMapping
    public void crearHabilidad (@RequestBody Habilidad pers){
        persoServ.crearHabilidad(pers);
        
    }
    @GetMapping
    @ResponseBody
    public List<Habilidad> verHabilidades (){
        return persoServ.verHabilidades();
    }
    
    @DeleteMapping
    public void borrarHabilidad (@PathVariable("idhabilidad") long idhabilidad){
        persoServ.borrarHabilidad(idhabilidad);
    }
    
}