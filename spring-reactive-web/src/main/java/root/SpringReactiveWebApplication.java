package root;

import root.hello.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Humble.X
 * @since 2021/12/11
 */
@SpringBootApplication
public class SpringReactiveWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringReactiveWebApplication.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        // We need to block for the content here or the JVM might exit before the message is logged
        System.out.println(">> message = " + greetingClient.getMessage().block());
    }

}
