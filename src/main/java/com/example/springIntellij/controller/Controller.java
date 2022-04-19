package com.example.springIntellij.controller;

import com.example.springIntellij.model.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    List<Persona> listaPersonas = new ArrayList();

    @GetMapping ("/hola")
    public String holamundo(){
        return "hola mundo";
    }
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona perso){
      listaPersonas.add(perso);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return listaPersonas;
    }
}
