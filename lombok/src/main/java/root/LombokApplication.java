package root;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import root.lombok.*;
import root.original.*;

/**
 * @author Humble.X
 * @since 2021/11/26
 */
@Slf4j
@SpringBootApplication
public class LombokApplication {
    public static void main(String[] args) {

        SpringApplication.run(LombokApplication.class, args);
        // @Getter/@Setter
        annotationGetterAndSetter();
        // @ToString
        annotationToString();
        // @EqualsAndHashCode
        annotationEqualsAndHashCode();
        // @NoArgsConstructor
        annotationNoArgsConstructor();
        // @AllArgsConstructor
        annotationAllArgsConstructor();
        // @RequiredArgsConstructor
        annotationRequiredArgsConstructor();
        // @Data
        annotationData();
        // @Value
        annotationValue();
        // @Builder
        annotationBuilder();
        // @Slf4j
        annotationSlf4j();

    }

    private static void annotationGetterAndSetter() {
        log.info("------------------------");
        log.info("@Getter/@Setter");
        GetterSetterLombokDemo getterSetterLombokDemo = new GetterSetterLombokDemo();
        getterSetterLombokDemo.setFoo("foo");
        getterSetterLombokDemo.setBar("bar");
        log.info("getterSetterLombokDemo.getFoo() : {}", getterSetterLombokDemo.getFoo());
        log.info("getterSetterLombokDemo.getBar() : {}", getterSetterLombokDemo.getBar());
        GetterSetterOriginDemo getterSetterOriginDemo = new GetterSetterOriginDemo();
        getterSetterOriginDemo.setFoo("foo");
        getterSetterOriginDemo.setBar("bar");
        log.info("getterSetterOriginDemo.getFoo() : {}", getterSetterOriginDemo.getFoo());
        log.info("getterSetterOriginDemo.getBar() : {}", getterSetterOriginDemo.getBar());
    }

    private static void annotationToString() {
        log.info("------------------------");
        log.info("@ToString");
        ToStringLombokDemo toStringLombokDemo = new ToStringLombokDemo();
        log.info("toStringLombokDemo.toString : {}", toStringLombokDemo);
        ToStringOriginDemo toStringOriginDemo = new ToStringOriginDemo();
        log.info("toStringOriginDemo.toString : {}", toStringOriginDemo);
    }

    private static void annotationEqualsAndHashCode() {
        log.info("------------------------");
        log.info("@EqualsAndHashCode");
        EqualsAndHashCodeLombokDemo equalsAndHashCodeLombokDemo1 = new EqualsAndHashCodeLombokDemo();
        EqualsAndHashCodeLombokDemo equalsAndHashCodeLombokDemo2 = new EqualsAndHashCodeLombokDemo();
        log.info("equalsAndHashCodeLombokDemo1.equals(equalsAndHashCodeLombokDemo2) : {}", equalsAndHashCodeLombokDemo1.equals(equalsAndHashCodeLombokDemo2));
        EqualsAndHashCodeOriginDemo equalsAndHashCodeOriginDemo1 = new EqualsAndHashCodeOriginDemo();
        EqualsAndHashCodeOriginDemo equalsAndHashCodeOriginDemo2 = new EqualsAndHashCodeOriginDemo();
        log.info("equalsAndHashCodeOriginDemo1.equals(equalsAndHashCodeOriginDemo2) : {}", equalsAndHashCodeOriginDemo1.equals(equalsAndHashCodeOriginDemo2));
    }

    private static void annotationNoArgsConstructor() {
        log.info("------------------------");
        log.info("@NoArgsConstructor");
        NoArgsConstructorLombokDemo noArgsConstructorLombokDemo = new NoArgsConstructorLombokDemo();
        log.info("noArgsConstructorLombokDemo : {}", noArgsConstructorLombokDemo);
        NoArgsConstructorOriginDemo noArgsConstructorOriginDemo = new NoArgsConstructorOriginDemo();
        log.info("noArgsConstructorOriginDemo : {}", noArgsConstructorOriginDemo);
    }

    private static void annotationAllArgsConstructor() {
        log.info("------------------------");
        log.info("@AllArgsConstructor");
        AllArgsConstructorLombokDemo allArgsConstructorLombokDemo = new AllArgsConstructorLombokDemo("foo", "bar");
        log.info("allArgsConstructorLombokDemo : {}", allArgsConstructorLombokDemo);
        AllArgsConstructorOriginDemo allArgsConstructorOriginDemo = new AllArgsConstructorOriginDemo("foo", "bar");
        log.info("allArgsConstructorOriginDemo : {}", allArgsConstructorOriginDemo);
    }

    private static void annotationRequiredArgsConstructor() {
        log.info("------------------------");
        log.info("@RequiredArgsConstructor");
        RequiredArgsConstructorLombokDemo requiredArgsConstructorLombokDemo = new RequiredArgsConstructorLombokDemo("foo");
        log.info("requiredArgsConstructorLombokDemo : {}", requiredArgsConstructorLombokDemo);
        RequiredArgsConstructorOriginDemo requiredArgsConstructorOriginDemo = new RequiredArgsConstructorOriginDemo("foo");
        log.info("requiredArgsConstructorOriginDemo : {}", requiredArgsConstructorOriginDemo);
    }

    private static void annotationData() {
        log.info("------------------------");
        log.info("@Data");
        DataLombokDemo dataLombokDemo1 = new DataLombokDemo("foo");
        dataLombokDemo1.setBar("bar");
        log.info("dataLombokDemo1.getFoo() : {}", dataLombokDemo1.getFoo());
        log.info("dataLombokDemo1.getBar() : {}", dataLombokDemo1.getBar());
        log.info("dataLombokDemo1.toString() : {}", dataLombokDemo1);
        DataLombokDemo dataLombokDemo2 = new DataLombokDemo("foo");
        dataLombokDemo2.setBar("bar");
        log.info("dataLombokDemo1.equals(dataLombokDemo2) : {}", dataLombokDemo1.equals(dataLombokDemo2));
        DataOriginDemo dataOriginDemo1 = new DataOriginDemo("foo");
        dataOriginDemo1.setBar("bar");
        log.info("dataOriginDemo1.getFoo() : {}", dataOriginDemo1.getFoo());
        log.info("dataOriginDemo1.getBar() : {}", dataOriginDemo1.getBar());
        log.info("dataOriginDemo1.toString() : {}", dataOriginDemo1);
        DataOriginDemo dataOriginDemo2 = new DataOriginDemo("foo");
        dataOriginDemo2.setBar("bar");
        log.info("dataOriginDemo1.equals(dataOriginDemo2) : {}", dataOriginDemo1.equals(dataOriginDemo2));
    }

    private static void annotationValue() {
        log.info("------------------------");
        log.info("@Value");
        ValueLombokDemo valueLombokDemo1 = new ValueLombokDemo("foo", "bar");
        log.info("valueLombokDemo1.getFoo() : {}", valueLombokDemo1.getFoo());
        log.info("valueLombokDemo1.getBar() : {}", valueLombokDemo1.getBar());
        log.info("valueLombokDemo1.toString() : {}", valueLombokDemo1);
        ValueLombokDemo valueLombokDemo2 = new ValueLombokDemo("foo", "bar");
        log.info("valueLombokDemo1.equals(valueLombokDemo2) : {}", valueLombokDemo1.equals(valueLombokDemo2));
        ValueOriginDemo valueOriginDemo1 = new ValueOriginDemo("foo", "bar");
        log.info("valueOriginDemo1.getFoo() : {}", valueOriginDemo1.getFoo());
        log.info("valueOriginDemo1.getBar() : {}", valueOriginDemo1.getBar());
        log.info("valueOriginDemo1.toString() : {}", valueOriginDemo1);
        ValueOriginDemo valueOriginDemo2 = new ValueOriginDemo("foo", "bar");
        log.info("valueOriginDemo1.equals(valueOriginDemo2) : {}", valueOriginDemo1.equals(valueOriginDemo2));
    }

    private static void annotationBuilder() {
        log.info("------------------------");
        log.info("@Builder");
        BuilderLombokDemo builderLombokDemo = BuilderLombokDemo.builder().foo("foo").bar("bar").build();
        log.info("builderLombokDemo : {}", builderLombokDemo);
        BuilderOriginDemo builderOriginDemo = BuilderOriginDemo.builder().foo("foo").bar("bar").build();
        log.info("builderOriginDemo : {}", builderOriginDemo);
    }

    private static void annotationSlf4j() {
        log.info("------------------------");
        log.info("@Slf4j");
        Slf4jLombokDemo slf4jLombokDemo = new Slf4jLombokDemo();
        slf4jLombokDemo.test();
        Slf4jOriginDemo slf4jOriginDemo = new Slf4jOriginDemo();
        slf4jOriginDemo.test();
    }
}
