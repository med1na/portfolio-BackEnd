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
    public List<Laboral> verLabor() {
        return persoRepo.findAll();
    }

    @Override
    public Laboral crearLabor(Laboral pers) {
        return persoRepo.save(pers);
    }

    @Override
    public void borrarLabor(Long idtrabajo) {
        persoRepo.deleteById(idtrabajo);
    }

    @Override
    public Laboral buscarLabor(Long idtrabajo) {
        return persoRepo.findById(idtrabajo).orElse(null);
    }
    
    @Override
    public Laboral modifLabor(Laboral pers) {
        return persoRepo.save(pers);
        
       // Long idtrabajo = pers.getIdtrabajo();
       //   if (idtrabajo != null && persoRepo.existsById(idtrabajo)) {
       //      return persoRepo.save(pers);
       // } else {
             // mensaje error
       //      return null;
       //   }
    }
}
