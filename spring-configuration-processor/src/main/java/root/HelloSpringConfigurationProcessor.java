package root;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import root.properties.CustomProperties;

/**
 * @author Humble.X
 * @since 2021/11/25
 */
@Slf4j
@Component
public class HelloSpringConfigurationProcessor {

    public HelloSpringConfigurationProcessor(CustomProperties customProperties) {
        log.info("HelloSpringConfigurationProcessor...");
        log.info("customProperties : {}", customProperties);
    }

}
