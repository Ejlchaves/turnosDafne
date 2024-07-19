package com.dafnesport.turnos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Alumno {
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Long legajo;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String celular;
    private String correo;
    private int creditos;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(Long legajo, String nombre, String apellido, String dni, String direccion, String celular, String correo, int creditos, boolean estado) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.creditos = creditos;
        this.estado = estado;
    }
                
}
