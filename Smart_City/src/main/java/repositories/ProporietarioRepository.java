package repositories;

import entities.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface ProporietarioRepository extends JpaRepository<Proprietario, Long> {
    List<Proprietario> findById_id (Long id);
    @Query(value = "SELECT * FROM Proprietario", nativeQuery = true)
    List<Task> customQuery(String name);

}