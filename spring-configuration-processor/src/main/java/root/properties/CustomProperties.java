package root.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(value = "custom")
public class CustomProperties {

    /**
     * field1 提示信息
     */
    private String field1;

    /**
     * field2 默认值:0
     */
    private Integer field2 = 0;

}
