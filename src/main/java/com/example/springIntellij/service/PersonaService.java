package com.example.springIntellij.service;

import com.example.springIntellij.model.Persona;
import com.example.springIntellij.repository.Irepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements IPersonaService{

    //inyeccion de dependencia
    @Autowired
    public Irepository repo;
    @Override
    public List<Persona> verPersonas() {
        return repo.findAll();
    }

    @Override
    public void agregarPersona(Persona perso) {
        repo.save(perso);
    }

    @Override
    public void borrarPersona(Long id) {
      repo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return repo.findById(id).orElse(null);
    }
}
