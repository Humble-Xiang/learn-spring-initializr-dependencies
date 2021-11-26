package root.original;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class RequiredArgsConstructorOriginDemo {

    private final String foo;
    private String bar;

    public RequiredArgsConstructorOriginDemo(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "RequiredArgsConstructorOriginDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
