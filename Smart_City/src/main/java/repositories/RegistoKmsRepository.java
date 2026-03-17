package repositories;

import entities.RegistoKms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface RegistoKmsRepository extends JpaRepository<RegistoKms, Long> {
    List<RegistoKms> findById_Id (Long id);
    @Query(value = "SELECT * FROM RegistoKms", nativeQuery = true)
    List<Task> customQuery(double kms_mes);

}