package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {

    @Query(value = "SELECT * FROM Taxa", nativeQuery = true)
    List<Taxa> customQuery(double taxa);

}