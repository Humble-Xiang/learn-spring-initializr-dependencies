package root.lombok;

import lombok.Builder;

/**
 * 自动生成 Builder 模式的方法，再也不用写一堆 setter 了
 * 注意，虽然只要加上 @Builder 注解，我们就能够用流式写法快速设定对象的值，但是 setter 还是必须要写不能省略的
 * 因为 Spring 或是其他框架有很多地方都会用到对象的 getter/setter 对他们取值/赋值
 * 所以通常是 @Data 和 @Builder 会一起用在同个类上，既方便我们流式写代码，也方便框架做事
 *
 * @author Humble.X
 * @since 2021/11/24
 */
@Builder
public class BuilderLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "BuilderLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }
}
