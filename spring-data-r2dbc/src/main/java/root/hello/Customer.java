package root.hello;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Humble.X
 * @since 2021/12/11
 */
@Data
public class Customer {

    @Id
    private Long id;
    private final String firstName;
    private final String lastName;

}
