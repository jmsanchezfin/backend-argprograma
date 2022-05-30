package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.Project;
import com.proyecto.portfolio.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    
    @Autowired
    private IProjectService projectService;
    
    @PostMapping ("/new/project")
    public void crearProject (@RequestBody Project projec) {
        projectService.crearProject(projec);
    }
    
    @GetMapping ("/list/project")
    @ResponseBody
    public List<Project> verProjects () {
        return projectService.verProjects();
    }
    
    @DeleteMapping ("/delete/project/{id}")
        public void borrarProject (@PathVariable int id) {
            projectService.borrarProject(id);
        }
}
