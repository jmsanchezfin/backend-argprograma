package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Project;
import com.proyecto.portfolio.repository.IProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    public IProjectRepository projectRepository;
    
    @Override
    public List<Project> verProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void crearProject(Project Projec) {
        projectRepository.save(Projec);
    }

    @Override
    public void borrarProject(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project buscarProject(int id) {
        return projectRepository.findById(id)
                .orElse(null);
    }
    
}
