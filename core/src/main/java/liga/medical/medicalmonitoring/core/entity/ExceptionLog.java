package liga.medical.medicalmonitoring.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "exception")
public class ExceptionLog extends Log {
}
