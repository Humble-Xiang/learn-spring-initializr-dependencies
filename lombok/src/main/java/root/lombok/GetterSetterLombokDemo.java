package root.lombok;

import lombok.Getter;
import lombok.Setter;

/**
 * 注解 @Getter 会自动生成 get... 方法
 * 注解 @Setter 会自动生成 set... 方法
 *
 * @author Humble.X
 * @since 2021/11/24
 */
@Getter
@Setter
public class GetterSetterLombokDemo {

    private String foo;
    private String bar;

}
