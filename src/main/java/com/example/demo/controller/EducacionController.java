package com.example.demo.controller;

import com.example.demo.model.Educacion;
import com.example.demo.service.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://portfolio-frontend-dmedina.web.app/")
public class EducacionController {
    
    @Autowired
    private IEducacionService persoServ;
    
    @PostMapping
    public void agregarPersona (@RequestBody Educacion pers){
        persoServ.crearPersona(pers);
        
    }
    @GetMapping
    @ResponseBody
    public List<Educacion> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping
    public void borrarPersona (@PathVariable("ideducacion") long ideducacion){
        persoServ.borrarPersona(ideducacion);
    }
    
}