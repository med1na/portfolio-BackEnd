package com.example.demo.service;

import com.example.demo.model.Habilidad;
import com.example.demo.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadRepository habilidadesRepo;
    
    @Override
    public List<Habilidad> verHabilidades() {
        return habilidadesRepo.findAll();
    }

    @Override
    public Habilidad buscarHabilidad(Long idhabilidad) {
        return habilidadesRepo.findById(idhabilidad).orElse(null);
    }

    @Override
    public void borrarHabilidad(Long idhabilidad) {
        habilidadesRepo.deleteById(idhabilidad);
    }
    
    @Override
    public void crearHabilidad(Habilidad per) {
        habilidadesRepo.save(per);
    }

    
}
