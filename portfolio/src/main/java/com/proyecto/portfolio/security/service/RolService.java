package com.proyecto.portfolio.security.service;

import com.proyecto.portfolio.security.entity.Rol;
import com.proyecto.portfolio.security.enums.RolNombre;
import com.proyecto.portfolio.security.repository.IRolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository rolRepository;
    
    public Optional<Rol> getByRolName(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }
            
    public  void save(Rol rol) {
        rolRepository.save(rol);
    }
    
}
