
package com.example.demo.service;

import com.example.demo.model.Habilidad;
import java.util.List;


public interface IHabilidadService {

    public List<Habilidad> verPersonas ();
    public void crearPersona (Habilidad per);
    public void borrarPersona (Long idhabilidad);
    public Habilidad buscarPersona (Long idhabilidad);
}
