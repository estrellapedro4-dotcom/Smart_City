package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.RelatorioMensal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RelatorioMensalRepository extends JpaRepository<RelatorioMensal, Long> {

    @Query(value = "SELECT * FROM RelatorioMensal", nativeQuery = true)
    List<RelatorioMensal> customQuery(String name);

}
