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

    @GetMapping("/login")
    public String loginForm() {
        return "Municipio/LoginMunicipio";
    }

    @PostMapping("/login")
    public String processarLogin(@RequestParam String codigo,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 Model model) {
        return "redirect:/municipio/home";
    }

    @GetMapping("/home")
    public String home() {
        return "Municipio/HomeMunicipio";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Municipio/DashboardMunicipio";
    }

    @GetMapping("/taxa")
    public String taxaForm() {
        return "Municipio/RedefinirTaxa";
    }

    @PostMapping("/taxa")
    public String processarTaxa(@RequestParam String valor,
                                Model model) {
        model.addAttribute("sucesso", true);
        return "Municipio/RedefinirTaxa";
    }

    @GetMapping("/relatorios")
    public String relatorios() {
        return "Municipio/RelatoriosMunicipio";
    }
}