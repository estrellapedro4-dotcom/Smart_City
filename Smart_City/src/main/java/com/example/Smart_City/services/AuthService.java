package com.example.Smart_City.services;

import com.example.Smart_City.entities.Utilizador;
import com.example.Smart_City.models.LoginModel;
import com.example.Smart_City.models.SignUpModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    List<Utilizador> utilizadores = new ArrayList<>();

    public Utilizador register(SignUpModel signUpModel) {
        Utilizador user = new Utilizador();
        user.setUsername(signUpModel.getUsername());
        user.setPassword(signUpModel.getPassword());
        utilizadores.add(user);
        return user;
    }

    public Utilizador login(LoginModel loginModel) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getUsername().equals(loginModel.getUsername())) {
                if (utilizador.getPassword().equals(loginModel.getPassword())) {
                    return utilizador;
                }
            }
        }
        return null;
    }

    /*public Utilizador getUtilizador(String username) {
        return UtilizadorRepository.getUtilizadorByUsername(username);
    }*/
}
