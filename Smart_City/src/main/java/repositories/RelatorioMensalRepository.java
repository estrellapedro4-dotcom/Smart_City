package repositories;

import entities.RelatorioMensal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RelatorioMensalRepository extends JpaRepository<RelatorioMensal, Long> {
    List<RelatorioMensal> findById_id (Long id);
    @Query(value = "SELECT * FROM RelatorioMensal", nativeQuery = true)
    List<RelatorioMensal> customQuery(String name);

}
