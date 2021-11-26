package root.lombok;

import lombok.NoArgsConstructor;

/**
 * 注解 @NoArgsConstructor 会自动生成空参构造函数
 *
 * @author Humble.X
 * @see AllArgsConstructorLombokDemo
 * @see RequiredArgsConstructorLombokDemo
 * @since 2021/11/24
 */
@NoArgsConstructor
public class NoArgsConstructorLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "NoArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
