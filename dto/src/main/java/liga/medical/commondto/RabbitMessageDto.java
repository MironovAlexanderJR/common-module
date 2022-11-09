package liga.medical.commondto;

import lombok.Data;

@Data
public class RabbitMessageDto {

    long id;

    Type type;

    String description;
}
