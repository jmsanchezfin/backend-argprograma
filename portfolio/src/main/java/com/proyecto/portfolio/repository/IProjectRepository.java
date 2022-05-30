package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Integer> {
    
    
}
