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
    public void agregarPersona (@RequestBody Habilidad pers){
        persoServ.crearPersona(pers);
        
    }
    @GetMapping
    @ResponseBody
    public List<Habilidad> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping
    public void borrarPersona (@PathVariable("idhabilidad") long idhabilidad){
        persoServ.borrarPersona(idhabilidad);
    }
    
}