package com.example.springIntellij.model;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
