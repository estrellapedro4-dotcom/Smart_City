package repositories;

import entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findById_id (Long id);
    @Query(value = "SELECT * FROM Veiculo", nativeQuery = true)
    List<Veiculo> customQuery(String matricula);

}