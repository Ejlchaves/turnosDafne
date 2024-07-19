package com.dafnesport.turnos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Profesor {
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Long legajo;
    private String nombre;
    private String apellido;
    private String dni;
    private String cel;
    private String correo;
    @OneToMany
    private List<HorarioProfesor> horarios;
    private boolean estado;

    public Profesor() {
    }

    public Profesor(Long legajo, String nombre, String apellido, String dni, String cel, String correo, List<HorarioProfesor> horarios, boolean estado) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cel = cel;
        this.correo = correo;
        this.horarios = horarios;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cel=" + cel + ", correo=" + correo + ", horarios=" + horarios + ", estado=" + estado + '}';
    }
      
}
