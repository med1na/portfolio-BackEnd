
package com.example.demo.service;

import com.example.demo.model.Educacion;
import java.util.List;


public interface IEducacionService {

    public List<Educacion> verPersonas ();
    public void crearPersona (Educacion per);
    public void borrarPersona (Long ideducacion);
    public Educacion buscarPersona (Long ideducacion);
}
