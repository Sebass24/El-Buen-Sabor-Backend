package com.example.buensabor.Models.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;

@MappedSuperclass
@Data //Getters and Setters
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean deleted;

//    @Column(name = "fecha_alta")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaAlta;
//
//    @Column(name = "fecha_modificacion")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaModificacion;
//
//    @Column(name = "fecha_baja")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaBaja;

}
