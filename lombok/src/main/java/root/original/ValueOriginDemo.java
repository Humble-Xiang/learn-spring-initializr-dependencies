package root.original;

import java.util.Objects;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class ValueOriginDemo {

    private final String foo;
    private final String bar;

    public ValueOriginDemo(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    @Override
    public String toString() {
        return "ValueOriginDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueOriginDemo that = (ValueOriginDemo) o;
        return Objects.equals(foo, that.foo) && Objects.equals(bar, that.bar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar);
    }

}
