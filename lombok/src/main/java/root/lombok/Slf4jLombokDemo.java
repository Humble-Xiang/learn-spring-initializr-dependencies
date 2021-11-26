package root.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * 注解 @Slf4j 会自动生成该类的 log 静态常量
 *
 * @author Humble.X
 * @since 2021/11/24
 */
@Slf4j
public class Slf4jLombokDemo {

    public void test() {
        log.info("this is Slf4jLombokDemo");
    }

}
