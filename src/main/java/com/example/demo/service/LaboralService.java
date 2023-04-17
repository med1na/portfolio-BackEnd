package com.example.demo.service;

import com.example.demo.model.Laboral;
import com.example.demo.repository.LaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaboralService implements ILaboralService{

    @Autowired
    public LaboralRepository persoRepo;
    
    @Override
    public List<Laboral> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Laboral per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long idtrabajo) {
        persoRepo.deleteById(idtrabajo);
    }

    @Override
    public Laboral buscarPersona(Long idtrabajo) {
        return persoRepo.findById(idtrabajo).orElse(null);
    }
    
}
