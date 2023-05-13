
package com.example.demo.service;

import com.example.demo.model.Educacion;
import java.util.List;


public interface IEducacionService {

    public List<Educacion> verEducacion ();
    public Educacion crearEducacion (Educacion per);
    public Educacion modifEducacion (Educacion per);
    public void borrarEducacion (Long ideducacion);
    public Educacion buscarEducacion (Long ideducacion);
}
