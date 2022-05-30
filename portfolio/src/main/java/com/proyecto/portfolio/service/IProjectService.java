package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Project;
import java.util.List;

public interface IProjectService {
    
    public List<Project> verProjects ();
    
    public void crearProject (Project Projec);
    
    public void borrarProject (int id);
    
    public Project buscarProject (int id);
    
}
