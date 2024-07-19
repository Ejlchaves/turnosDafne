package com.dafnesport.turnos.service;

import com.dafnesport.turnos.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {
    
    @Autowired 
    private ActividadRepository ActividadRepo;
}
