package liga.medical.medicalmonitoring.core.repository;

import java.util.UUID;
import liga.medical.medicalmonitoring.core.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, UUID> {
}
