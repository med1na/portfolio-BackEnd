package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="habilidad")
public class Habilidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    
    private Long idhabilidad;
    private String tecnologia;
    private String porcentaje;
    private String descripcion;
    private String personaidpersona;
    private String idioma;
    
    public Habilidad(){
        
    }
    
    public Habilidad(Long idhabilidad, String tecnologia, String descripcion, String porcentaje, String personaidpersona, String idioma){
        this.idhabilidad=idhabilidad;
        this.tecnologia=tecnologia;
        this.porcentaje=porcentaje;
        this.descripcion=descripcion;
        this.personaidpersona=personaidpersona;
        this.idioma=idioma;
    }
    
}
