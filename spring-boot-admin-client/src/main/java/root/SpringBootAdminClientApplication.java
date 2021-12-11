package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Humble.X
 * @since 2021/12/10
 */
@SpringBootApplication
public class SpringBootAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClientApplication.class, args);
    }

    /**
     * Spring boot 2.2.x 正式版开始，不再默认 开启 InMemoryHttpTraceRepository，所以导致 Client 注册上来后看不到 Http Trace。可以使用如下代码手动注入 InMemoryHttpTraceRepository。
     *
     * @return HttpTraceRepository
     */
    @Bean
    public HttpTraceRepository httpTraceRepository() {
        return new InMemoryHttpTraceRepository();
    }

}
