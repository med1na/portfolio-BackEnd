package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
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
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @GetMapping
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/{idusuarios}")
    public void borrarPersona (@PathVariable("idusuarios") long idusuarios){
        persoServ.borrarPersona(idusuarios);
    }
    
}