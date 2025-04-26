package com.prova.biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.prova.biblioteca.model.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}

