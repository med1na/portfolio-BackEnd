
package com.example.demo.service;

import com.example.demo.model.Laboral;
import java.util.List;


public interface ILaboralService {

    public List<Laboral> verLabor ();
    public Laboral crearLabor (Laboral per);
    public Laboral modifLabor (Laboral per);
    public void borrarLabor (Long idtrabajo);
    public Laboral buscarLabor (Long idtrabajo);
}
