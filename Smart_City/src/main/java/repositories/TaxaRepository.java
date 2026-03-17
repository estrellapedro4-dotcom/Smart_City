package repositories;

import entities.Cidadao;
import entities.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {
    List<Taxa> findById_id (Long id);
    @Query(value = "SELECT * FROM Taxa", nativeQuery = true)
    List<Taxa> customQuery(double taxa);

}