package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer> {
    
    
}
