package root.original;

import java.util.Objects;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class DataOriginDemo {

    private final String foo;
    private String bar;

    public DataOriginDemo(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "DataOriginDemo{" +
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
        DataOriginDemo that = (DataOriginDemo) o;
        return Objects.equals(foo, that.foo) && Objects.equals(bar, that.bar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar);
    }

}
