
package com.dafnesport.turnos.repository;

import com.dafnesport.turnos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfesorRepository extends JpaRepository <Profesor, Long>{
      
}
