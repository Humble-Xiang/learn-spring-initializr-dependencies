## Spring Boot Admin Server

Spring Boot Admin Server 用于管理和监控 SpringBoot 应用程序。 为 Spring Boot Actuator 提供了一个 UI 页面。

### 引入依赖

```xml
<dependencies>
    <dependency>
        <groupId>de.codecentric</groupId>
        <artifactId>spring-boot-admin-starter-server</artifactId>
        <version>${spring.boot.admin.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

### 启用 Admin Server

在启动类或自定义配置类，添加 `@EnableAdminServer` 注解以启用 Admin Server。

```java
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApplication.class, args);
    }
}
```

### 项目结构

```
├── java.root/
│   ├── SpringBootAdminServerApplication            启动类
├── resources
│   ├── application.yaml                            项目配置
```
