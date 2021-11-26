package root.original;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class Slf4jOriginDemo {

    private static final Logger log = LoggerFactory.getLogger(Slf4jOriginDemo.class);

    public void test() {
        log.info("this is Slf4jOriginDemo");
    }

}
