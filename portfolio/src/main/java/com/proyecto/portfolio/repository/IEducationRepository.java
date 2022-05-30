package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository<Education, Integer> {
    
    
}
