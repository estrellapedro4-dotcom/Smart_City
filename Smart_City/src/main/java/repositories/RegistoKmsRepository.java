package repositories;

import entities.Cidadao;
import entities.RegistoKms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface RegistoKmsRepository extends JpaRepository<RegistoKms, Long> {
    List<Cidadao> findById_RegistoKms (Long id_RegistoKms);
    @Query(value = "SELECT * FROM RegistoKms", nativeQuery = true)
    List<Task> customQuery(double kms_mes);

}