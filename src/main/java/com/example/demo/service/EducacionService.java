package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository persoRepo;
    
    @Override
    public List<Educacion> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Educacion per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long ideducacion) {
        persoRepo.deleteById(ideducacion);
    }

    @Override
    public Educacion buscarPersona(Long ideducacion) {
        return persoRepo.findById(ideducacion).orElse(null);
    }
    
}
