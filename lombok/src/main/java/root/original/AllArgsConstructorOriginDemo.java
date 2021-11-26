package root.original;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class AllArgsConstructorOriginDemo {

    private String foo;
    private String bar;

    public AllArgsConstructorOriginDemo(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "AllArgsConstructorOriginDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
