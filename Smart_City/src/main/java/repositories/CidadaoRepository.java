package repositories;

import entities.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {
    List<Cidadao> findById_cidadao (Long id_cidadao);
    @Query(value = "SELECT * FROM Cidadao", nativeQuery = true)
    List<Task> customQuery(String name);

}
