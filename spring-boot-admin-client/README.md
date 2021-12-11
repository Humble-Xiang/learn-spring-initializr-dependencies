## Spring Boot Admin Client

Spring Boot Admin Client 用于向 Spring Boot Admin Server 注册你的 SpringBoot 应用程序。

### 引入依赖

```xml
<dependencies>
    <dependency>
        <groupId>de.codecentric</groupId>
        <artifactId>spring-boot-admin-starter-client</artifactId>
        <version>${spring.boot.admin.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

### 如何手动开启 Http Trace

Spring boot 2.2.x 正式版开始，不再默认 开启 InMemoryHttpTraceRepository，所以导致 Client 注册上来后看不到 Http Trace。可以使用如下代码手动注入 InMemoryHttpTraceRepository。

```java
@Bean
public HttpTraceRepository httpTraceRepository() {
    return new InMemoryHttpTraceRepository();
}
```

> [Disable management.trace.http by default](https://github.com/spring-projects/spring-boot/issues/15039)  
> [Encourage the use of third-party tracing and observability solutions in addition to / instead of implementing your own HttpTraceRepositroy](https://github.com/spring-projects/spring-boot/issues/17047)

### 项目结构

```
├── java.root/
│   ├── SpringBootAdminClientApplication            启动类
├── resources
│   ├── application.yaml                            项目配置
```
