package root.original;

/**
 * @author Humble.X
 * @since 2021/11/24
 */
public class BuilderOriginDemo {

    private String foo;
    private String bar;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String foo;
        private String bar;

        public Builder foo(String foo) {
            this.foo = foo;
            return this;
        }

        public Builder bar(String bar) {
            this.bar = bar;
            return this;
        }

        public BuilderOriginDemo build() {
            BuilderOriginDemo builderOriginDemo = new BuilderOriginDemo();
            builderOriginDemo.setFoo(this.foo);
            builderOriginDemo.setBar(this.bar);
            return builderOriginDemo;
        }

    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "BuilderOriginDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
