package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

    @Query(value = "SELECT * FROM Municipio", nativeQuery = true)
    List<Municipio> customQuery(String name);

}
