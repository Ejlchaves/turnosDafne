
package com.dafnesport.turnos.service;

import com.dafnesport.turnos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {
    
    @Autowired 
    private ProfesorRepository ProfesorRepo;
}
