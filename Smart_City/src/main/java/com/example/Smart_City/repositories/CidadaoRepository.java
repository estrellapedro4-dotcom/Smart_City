package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

    @Query(value = "SELECT * FROM Cidadao", nativeQuery = true)
    List<Cidadao> customQuery(String name);
}
