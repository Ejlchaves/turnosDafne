
package com.dafnesport.turnos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HorarioProfesor {
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Long codigo;
    private String nombre;
    private int idProfe;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFinal;
    @ManyToOne
    private Profesor profe;
    @OneToMany
    private List<Alumno> alumno;
    private boolean estado;

    public HorarioProfesor() {
    }

    public HorarioProfesor(Long codigo, String nombre, int idProfe, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFinal, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.idProfe = idProfe;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFinal = fechaHoraFinal;
        this.estado = estado;
    }





}
