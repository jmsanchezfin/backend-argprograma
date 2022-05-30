package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAboutRepository extends JpaRepository<About, Integer> {
  
}
