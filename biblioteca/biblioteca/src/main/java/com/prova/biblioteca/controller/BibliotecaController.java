package com.prova.biblioteca.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.biblioteca.model.Biblioteca;
import com.prova.biblioteca.service.BibliotecaService;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping
    public List<Biblioteca> listar() {
        return bibliotecaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Biblioteca> buscarPorId(@PathVariable Long id) {
        return bibliotecaService.buscarPorId(id);
    }

    @PostMapping
    public Biblioteca salvar(@RequestBody Biblioteca biblioteca) {
        return bibliotecaService.salvar(biblioteca);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        bibliotecaService.excluir(id);
    }
}

