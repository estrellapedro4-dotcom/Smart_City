package com.example.Smart_City.services;

import com.example.Smart_City.entities.Cidadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Smart_City.repositories.CidadaoRepository;

import java.util.List;

@Service
public class CidadaoService {

    @Autowired
    private CidadaoRepository cidadaoRepository;

    public List<Cidadao> listarCidadaos() {
        return cidadaoRepository.findAll();
    }

    public Cidadao guardarCidadao(Cidadao cidadao) {
        return cidadaoRepository.save(cidadao);
    }
}
