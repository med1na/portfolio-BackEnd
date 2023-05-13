package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    
    private Long idusuarios;
    private String nombre_usuario;
    private String contraseña;
    private String mail;
    private String provincia;
    private String telefono;
    
    public Persona(){
        
    }
    
    public Persona(Long idusuarios, String nombre_usuario, String contraseña, String mail, String provincia, String telefono){
        this.idusuarios=idusuarios;
        this.nombre_usuario=nombre_usuario;
        this.contraseña=contraseña;
        this.mail=mail;
        this.provincia=provincia;
        this.telefono=telefono;
    }
    
}
