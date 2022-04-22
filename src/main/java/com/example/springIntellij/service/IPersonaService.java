package com.example.springIntellij.service;

import com.example.springIntellij.model.Persona;

import java.util.List;

public interface IPersonaService {
    //creamos los métodos sin implementarlos
    public List<Persona> verPersonas();
    public void agregarPersona(Persona perso);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
