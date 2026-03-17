package com.example.Smart_City.repositories;

import com.example.Smart_City.entities.RegistoKms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface RegistoKmsRepository extends JpaRepository<RegistoKms, Long> {

    @Query(value = "SELECT * FROM RegistoKms", nativeQuery = true)
    List<RegistoKms> customQuery(double kms_mes);

}