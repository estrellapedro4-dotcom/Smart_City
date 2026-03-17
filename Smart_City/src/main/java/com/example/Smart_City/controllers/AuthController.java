package com.example.Smart_City.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    // GET / → mostra LoginGeral.jsp
    @GetMapping("/")
    public String loginGeral() {
        return "LoginGeral";
    }

    // POST /login → recebe email+password (lógica real vem depois)
    @PostMapping("/login")
    public String processarLogin(@RequestParam String email,
                                 @RequestParam String password,
                                 Model model) {
        // Por agora redireciona para município (mock como no Figma)
        // Quando tiveres autenticação real, validas aqui contra UtilizadorRepository
        return "redirect:/municipio";
    }

    // GET /recuperar-password → mostra formulário
    @GetMapping("/recuperar-password")
    public String recuperarPasswordForm() {
        return "RecuperarPassword";
    }

    // POST /recuperar-password → processa email
    @PostMapping("/recuperar-password")
    public String processarRecuperacao(@RequestParam String email,
                                       Model model) {
        // Lógica de envio de email vem depois
        // Por agora apenas sinaliza que foi enviado
        model.addAttribute("emailEnviado", true);
        return "RecuperarPassword";
    }
}
