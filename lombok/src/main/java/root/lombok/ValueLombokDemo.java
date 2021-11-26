package root.lombok;

import lombok.Value;

/**
 * 整合注解 @Value = @Getter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
 *
 * @author Humble.X
 * @see GetterSetterLombokDemo
 * @see ToStringLombokDemo
 * @see EqualsAndHashCodeLombokDemo
 * @see RequiredArgsConstructorLombokDemo
 * @since 2021/11/24
 */
@Value
public class ValueLombokDemo {

    String foo;
    String bar;

}
