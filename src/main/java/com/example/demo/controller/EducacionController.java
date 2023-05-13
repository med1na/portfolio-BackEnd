package com.example.demo.controller;

import com.example.demo.model.Educacion;
import com.example.demo.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/educacion")
//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://portfolio-frontend-dmedina.web.app/")
public class EducacionController {
    
    @Autowired
    private IEducacionService persoServ;
    
    @PostMapping
    public void agregarEducacion (@RequestBody Educacion pers){
        persoServ.crearEducacion(pers);
    }
    
    @GetMapping
    @ResponseBody
    public List<Educacion> verEducacion (){
        return persoServ.verEducacion();
    }
    
    @DeleteMapping("/{ideducacion}")
    public void borrarEducacion (@PathVariable("ideducacion") long ideducacion){
        persoServ.borrarEducacion(ideducacion);
    }
    
    @GetMapping("/{ideducacion}")
    public ResponseEntity<Educacion> buscarEducacionId (@PathVariable Long ideducacion){
        return ResponseEntity.ok(persoServ.buscarEducacion(ideducacion));
    }

    @PutMapping
    public ResponseEntity<Educacion> modifLabor(@RequestBody Educacion pers){
         ResponseEntity<Educacion> response;
        if (pers.getIdeducacion() != null && persoServ.buscarEducacion(pers.getIdeducacion()) != null){
            response= ResponseEntity.ok(persoServ.modifEducacion(pers));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    return response;
    }
}