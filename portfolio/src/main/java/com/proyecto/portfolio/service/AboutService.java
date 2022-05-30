//Esta clase va a tener la implementacion de todos los metodos que se cargan
//en la interface

package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.About;
import com.proyecto.portfolio.repository.IAboutRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {

    //inyectamos la dependencia desde el repository
    @Autowired
    public IAboutRepository aboutRepository;
    
    @Override
    public List<About> verAbouts() {
        return aboutRepository.findAll();      
    }

    @Override
    public void crearAbout(About abou) {
        aboutRepository.save(abou);
    }

    @Override
    public void borrarAbout(int id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public About buscarAbout(int id) {
        return aboutRepository.findById(id)
                .orElse(null);
    }
    
}
