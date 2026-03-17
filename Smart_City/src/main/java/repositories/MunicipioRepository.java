package repositories;

import entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
    List<Municipio> findById_id (Long id);
    @Query(value = "SELECT * FROM Municipio", nativeQuery = true)
    List<Task> customQuery(String name);

}
