package root.lombok;

import lombok.RequiredArgsConstructor;

/**
 * 注解 @RequiredArgsConstructor 会自动生成必要参构造函数
 *
 * @author Humble.X
 * @see NoArgsConstructorLombokDemo
 * @see AllArgsConstructorLombokDemo
 * @since 2021/11/24
 */
@RequiredArgsConstructor
public class RequiredArgsConstructorLombokDemo {

    private final String foo;
    private String bar;

    @Override
    public String toString() {
        return "RequiredArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
