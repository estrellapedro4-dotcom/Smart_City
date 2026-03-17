package com.example.Smart_City.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Redireciona raiz para login se não houver sessão
    @GetMapping("/home")
    public String home() {
        return "redirect:/";
    }
}