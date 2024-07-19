
package com.dafnesport.turnos.service;

import com.dafnesport.turnos.repository.HorarioProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioProfesorService {
    
    @Autowired 
    private HorarioProfesorRepository HorarioProfesorRepo;
}
