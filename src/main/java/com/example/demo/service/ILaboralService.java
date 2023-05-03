
package com.example.demo.service;

import com.example.demo.model.Laboral;
import java.util.List;


public interface ILaboralService {

    public List<Laboral> verLabor ();
    public void crearLabor (Laboral per);
    public void modifLabor (Laboral per);
    public void borrarLabor (Long idtrabajo);
    public Laboral buscarLabor (Long idtrabajo);
}
