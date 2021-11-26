package root.lombok;

import lombok.Data;

/**
 * 整合注解 @Data = @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
 *
 * @author Humble.X
 * @see GetterSetterLombokDemo
 * @see ToStringLombokDemo
 * @see EqualsAndHashCodeLombokDemo
 * @see RequiredArgsConstructorLombokDemo
 * @since 2021/11/24
 */
@Data
public class DataLombokDemo {

    private final String foo;
    private String bar;

}
