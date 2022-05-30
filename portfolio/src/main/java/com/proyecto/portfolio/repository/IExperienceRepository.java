package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceRepository extends JpaRepository<Experience, Integer> {
    
    
    
}
