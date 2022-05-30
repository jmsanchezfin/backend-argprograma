package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> verEducations ();
    
    public void crearEducation (Education Educatio);
    
    public void borrarEducation (int id);
    
    public Education buscarEducation (int id);
    
}
