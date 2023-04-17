
package com.example.demo.service;

import com.example.demo.model.Laboral;
import java.util.List;


public interface ILaboralService {

    public List<Laboral> verPersonas ();
    public void crearPersona (Laboral per);
    public void borrarPersona (Long idtrabajo);
    public Laboral buscarPersona (Long idtrabajo);
}
