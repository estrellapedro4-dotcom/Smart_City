package repositories;

import entities.Cidadao;
import entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Cidadao> findById_veiculo (Long id_veiculo);
    @Query(value = "SELECT * FROM Veiculo", nativeQuery = true)
    List<Task> customQuery(String matricula);

}