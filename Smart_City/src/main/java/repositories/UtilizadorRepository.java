package repositories;

import entities.Cidadao;
import entities.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {
    List<Cidadao> findById_utilizador (Long id_utilizador);
    @Query(value = "SELECT * FROM Utilizador", nativeQuery = true)
    List<Task> customQuery(String name);

}