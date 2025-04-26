package com.prova.biblioteca.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.biblioteca.model.Biblioteca;
import com.prova.biblioteca.repository.BibliotecaRepository;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public List<Biblioteca> listar() {
        return bibliotecaRepository.findAll();
    }

    public Optional<Biblioteca> buscarPorId(Long id) {
        return bibliotecaRepository.findById(id);
    }

    public Biblioteca salvar(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    public void excluir(Long id) {
        bibliotecaRepository.deleteById(id);
    }
}

