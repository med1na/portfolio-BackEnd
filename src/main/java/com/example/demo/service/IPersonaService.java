
package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;


public interface IPersonaService {

    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public Persona buscarPersona (Long idusuarios);
}
