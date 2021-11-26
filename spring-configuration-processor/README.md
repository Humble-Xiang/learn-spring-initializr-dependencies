## Spring Configuration Processor

给使用了 @ConfigurationProperties 注解的自定义配置类生成元数据信息，可以在你编写配置文件时，对自定义的配置提供提示（需要打包）。

### 引入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

```xml
<!-- 打包时排除 -->
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <excludes>
            <exclude>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-configuration-processor</artifactId>
            </exclude>
        </excludes>
    </configuration>
</plugin>
```

### 项目结构

```
├── java.root/
│   ├── properties/
│   │   ├── CustomProperties                        自定义配置信息类
│   ├── HelloSpringConfigurationProcessor           演示类
│   ├── SpringConfigurationProcessorApplication     启动类
├── resources
│   ├── application.yaml                            项目配置
```

### 演示

使用 @ConfigurationProperties 注解的自定义配置类，打包后生成生成元数据信息，写配置文件时 IDE 会给予提示。

![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.40o65twl55q0.png)
![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.3iex9f8f37k0.png)

### 扩展

通过 @ConfigurationProperties 注解对象访问配置信息

![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.65d04do5wn40.png)
![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.59f52eag5x00.png)
![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.4b2c1cwq9ja0.png)
![image](https://cdn.jsdelivr.net/gh/Humble-Xiang/picx-images@master/geek/image.q0zzgxswgb4.png)
