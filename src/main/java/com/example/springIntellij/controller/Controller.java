package com.example.springIntellij.controller;

import com.example.springIntellij.model.Persona;
import com.example.springIntellij.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
            private IPersonaService persoServ;

    @GetMapping ("/hola")
    public String holamundo(){
        return "hola mundo";
    }
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona perso){
        persoServ.agregarPersona(perso);
      //listaPersonas.add(perso);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
                //listaPersonas;
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
