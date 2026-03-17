package repositories;

import entities.Cidadao;
import entities.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {
    List<Cidadao> findById_cidadao (Long id_taxa);
    @Query(value = "SELECT * FROM Taxa", nativeQuery = true)
    List<Task> customQuery(double taxa);

}