package com.dafnesport.turnos.repository;

import com.dafnesport.turnos.model.HorarioProfesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HorarioProfesorRepository extends JpaRepository <HorarioProfesor, Long>{
    
    
}

