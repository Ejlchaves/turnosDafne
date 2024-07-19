package com.dafnesport.turnos.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Actividad {
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Long codigo;
    private String nombre;
    
    
    
}
