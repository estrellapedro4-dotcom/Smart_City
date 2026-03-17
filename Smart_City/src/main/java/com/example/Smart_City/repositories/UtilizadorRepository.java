package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {

    @Query(value = "SELECT * FROM Utilizador", nativeQuery = true)
    List<Utilizador> customQuery(String name);

}