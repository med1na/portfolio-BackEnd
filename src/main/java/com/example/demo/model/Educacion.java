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
@Table(name="educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    
    private Long ideducacion;
    private String titulo;
    private String lugar_cursado;
    private String descripcion;
    private String fecha_cursado;
    private String persona_idusuarios;
    
    public Educacion(){
        
    }
    
    public Educacion(Long ideducacion, String titulo, String lugar_cursado, String descripcion, String fecha_cursado, String persona_idusuarios){
        this.ideducacion=ideducacion;
        this.titulo=titulo;
        this.lugar_cursado=lugar_cursado;
        this.descripcion=descripcion;
        this.fecha_cursado=fecha_cursado;
        this.persona_idusuarios=persona_idusuarios;
        
    }
    
}
