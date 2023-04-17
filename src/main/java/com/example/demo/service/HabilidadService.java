package com.example.demo.service;

import com.example.demo.model.Habilidad;
import com.example.demo.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadRepository persoRepo;
    
    @Override
    public List<Habilidad> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Habilidad per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long idhabilidad) {
        persoRepo.deleteById(idhabilidad);
    }

    @Override
    public Habilidad buscarPersona(Long idhabilidad) {
        return persoRepo.findById(idhabilidad).orElse(null);
    }
    
}
