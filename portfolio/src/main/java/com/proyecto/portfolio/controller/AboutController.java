package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.About;
import com.proyecto.portfolio.service.IAboutService;
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
public class AboutController {
    
    @Autowired
    private IAboutService aboutService;
        
    //genero metodo agregar about y lo envio POST mediante url
    @PostMapping ("/new/about")
    public void crearAbout (@RequestBody About abou) {
        aboutService.crearAbout(abou);
    }
    
    //genero metodo ver about por URL y lo recibo GET mediante BODY
    @GetMapping ("/list/about")
    @ResponseBody
    public List<About> verAbouts () {
        return aboutService.verAbouts();
    }
    
    @DeleteMapping ("/delete/about/{id}")
    public void borrarAbout (@PathVariable int id) {
        aboutService.borrarAbout(id);
    }
    
 
}
