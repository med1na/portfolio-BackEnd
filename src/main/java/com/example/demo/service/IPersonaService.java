
package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long idusuarios);
    public Persona buscarPersona (Long idusuarios);
}
