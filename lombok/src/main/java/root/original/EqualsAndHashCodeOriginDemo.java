package root.original;

import java.util.Objects;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class EqualsAndHashCodeOriginDemo {

    private String foo;
    private String bar;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EqualsAndHashCodeOriginDemo that = (EqualsAndHashCodeOriginDemo) o;
        return Objects.equals(foo, that.foo) && Objects.equals(bar, that.bar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar);
    }

}
