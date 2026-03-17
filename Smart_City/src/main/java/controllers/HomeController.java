package controllers;

import models.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String homePage() {
        return "index";
    }

    @PostMapping(value = "/test")
    public String test(LoginModel loginModel) {
        System.out.println(loginModel.getUsername());
        System.out.println(loginModel.getPassword());
        //adicionar condicionantes para ir ou para loginCidadao ou loginMunicipio
        return "index";
    }
}