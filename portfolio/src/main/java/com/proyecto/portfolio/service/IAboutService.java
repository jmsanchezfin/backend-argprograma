package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.About;
import java.util.List;

public interface IAboutService {
    
    public List<About> verAbouts ();
    
    public void crearAbout (About abou);
    
    public void borrarAbout (int id);
    
    public About buscarAbout (int id);
    
}
