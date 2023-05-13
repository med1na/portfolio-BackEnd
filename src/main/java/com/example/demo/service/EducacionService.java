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
    public List<Educacion> verEducacion() {
        return persoRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion per) {
        return persoRepo.save(per);
    }

    @Override
    public void borrarEducacion(Long ideducacion) {
        persoRepo.deleteById(ideducacion);
    }

    @Override
    public Educacion buscarEducacion(Long ideducacion) {
        return persoRepo.findById(ideducacion).orElse(null);
    }
    
    @Override
    public Educacion modifEducacion(Educacion pers) {
        return persoRepo.save(pers);
    }
}
