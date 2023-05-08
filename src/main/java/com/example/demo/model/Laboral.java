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
@Table(name="laboral")
public class Laboral implements Serializable {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    
    private Long idtrabajo;
    private String descripcion;
    private String fecha_fin;
    private String fecha_inicio;
    private String nombre_empresa;
    private String nombre_trabajo;
       
    public Laboral(){
        
    }
    
    public Laboral(Long idtrabajo, String nombre_trabajo, String nombre_empresa, String fecha_inicio, String fecha_fin, String descripcion){
        this.idtrabajo=idtrabajo;
        this.descripcion=descripcion;
        this.fecha_fin=fecha_fin;
        this.fecha_inicio=fecha_inicio;
        this.nombre_empresa=nombre_empresa;
        this.nombre_trabajo=nombre_trabajo;
        
    }
    
}
