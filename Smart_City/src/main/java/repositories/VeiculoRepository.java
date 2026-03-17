package repositories;

import entities.Cidadao;
import entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findById_id (Long id);
    @Query(value = "SELECT * FROM Veiculo", nativeQuery = true)
    List<Veiculo> customQuery(String matricula);

}