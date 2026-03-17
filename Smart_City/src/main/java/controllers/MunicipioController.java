package com.example.Smart_City.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/municipio")
public class MunicipioController {

    // GET /municipio/login → mostra LoginMunicipio.jsp
    @GetMapping("/login")
    public String loginForm() {
        return "Municipio/LoginMunicipio";
    }

    // POST /municipio/login → processa login
    @PostMapping("/login")
    public String processarLogin(@RequestParam String codigo,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 Model model) {
        // Lógica de validação vem depois com MunicipioRepository
        // Por agora redireciona para home do município
        return "redirect:/municipio/home";
    }

    // GET /municipio/home → página após login (próximo JSP)
    @GetMapping("/home")
    public String home() {
        return "Municipio/HomeMunicipio";
    }
}