package root.lombok;

import lombok.EqualsAndHashCode;

/**
 * 注解 @EqualsAndHashCode 会自动生成 equals 和 hashCode 方法
 * 包括所有非静态变量和非 transient 的变量
 *
 * @author Humble.X
 * @since 2021/11/24
 */
@EqualsAndHashCode
public class EqualsAndHashCodeLombokDemo {

    private String foo;
    private String bar;

}
