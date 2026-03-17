package repositories;

import entities.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {
    List<Cidadao> findById_id(Long id);
    @Query(value = "SELECT * FROM Cidadao", nativeQuery = true)
    List<Cidadao> customQuery(String name);

}
