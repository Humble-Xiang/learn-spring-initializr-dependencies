package root.original;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class ToStringOriginDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "ToStringOriginDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }
}
