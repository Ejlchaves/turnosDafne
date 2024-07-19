package com.dafnesport.turnos.service;

import com.dafnesport.turnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    
    @Autowired 
    private AlumnoRepository AlumnoRepo;
}