package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Experience;
import com.proyecto.portfolio.repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    public IExperienceRepository experienceRepository;
    
    @Override
    public List<Experience> verExperiences() {
        return experienceRepository.findAll();
    }

    @Override
    public void crearExperience(Experience Experienc) {
        experienceRepository.save(Experienc);
    }

    @Override
    public void borrarExperience(int id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience buscarExperience(int id) {
        return experienceRepository.findById(id)
                .orElse(null);
    }
    
}
