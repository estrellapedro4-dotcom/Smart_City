package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query(value = "SELECT * FROM Veiculo", nativeQuery = true)
    List<Veiculo> customQuery(String matricula);

}