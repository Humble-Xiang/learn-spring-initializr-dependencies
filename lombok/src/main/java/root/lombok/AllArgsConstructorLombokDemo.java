package root.lombok;

import lombok.AllArgsConstructor;

/**
 * 注解 @AllArgsConstructor 会自动生成全参构造函数
 * 很多地方（像是 Spring Data JPA），会需要每个类都一定要有一个无参数的构造器，所以在加上 @AllArgsConstructor 时，一定要补上 @NoArgsConstructor
 *
 * @author Humble.X
 * @see NoArgsConstructorLombokDemo
 * @see RequiredArgsConstructorLombokDemo
 * @since 2021/11/24
 */
@AllArgsConstructor
public class AllArgsConstructorLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "AllArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
