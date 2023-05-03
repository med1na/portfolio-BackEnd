
package com.example.demo.service;

import com.example.demo.model.Habilidad;
import java.util.List;


public interface IHabilidadService {

    public List<Habilidad> verHabilidades ();
    public void crearHabilidad (Habilidad per);
    public void borrarHabilidad (Long idhabilidad);
    public Habilidad buscarHabilidad (Long idhabilidad);
}
