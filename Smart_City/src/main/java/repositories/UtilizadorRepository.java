package repositories;

import entities.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {
    List<Utilizador> findById_id (Long id);
    @Query(value = "SELECT * FROM Utilizador", nativeQuery = true)
    List<Task> customQuery(String name);

}