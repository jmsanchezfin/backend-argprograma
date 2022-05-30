package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Skill;
import com.proyecto.portfolio.repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {

    @Autowired
    public ISkillRepository skillRepository;
    
    @Override
    public List<Skill> verSkills() {
        return skillRepository.findAll();
    }

    @Override
    public void crearSkill(Skill Skil) {
        skillRepository.save(Skil);
    }

    @Override
    public void borrarSkill(int id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill buscarSkill(int id) {
        return skillRepository.findById(id)
                .orElse(null);
    }
    
}
