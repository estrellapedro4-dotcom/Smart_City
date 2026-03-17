package repositories;

import entities.Cidadao;
import entities.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface ProporietarioRepository extends JpaRepository<Proprietario, Long> {
    List<Cidadao> findById_proprietario (Long id_proprietario);
    @Query(value = "SELECT * FROM Proprietario", nativeQuery = true)
    List<Task> customQuery(String name);

}