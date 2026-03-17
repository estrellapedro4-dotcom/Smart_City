package com.example.Smart_City.controllers;

import com.example.Smart_City.entities.Cidadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Smart_City.services.CidadaoService;

import java.util.List;
@Controller
public class CidadaoController {
    @Autowired
    private CidadaoService cidadaoService;

    @GetMapping
    public List<Cidadao> listarTodos() {
        return cidadaoService.listarCidadaos();
    }

    @PostMapping
    public Cidadao criarCidadao(@RequestBody Cidadao cidadao) {
        return cidadaoService.guardarCidadao(cidadao);
    }
}
