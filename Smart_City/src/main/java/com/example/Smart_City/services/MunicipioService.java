package com.example.Smart_City.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Smart_City.repositories.MunicipioRepository;

@Service
public class MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;
}
