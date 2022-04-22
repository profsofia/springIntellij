package com.example.springIntellij.repository;

import com.example.springIntellij.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Irepository extends JpaRepository<Persona, Long>{
}
