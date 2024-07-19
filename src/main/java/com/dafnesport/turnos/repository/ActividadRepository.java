package com.dafnesport.turnos.repository;

import com.dafnesport.turnos.model.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ActividadRepository extends JpaRepository <Actividad, Long>{
    
    
    
}
