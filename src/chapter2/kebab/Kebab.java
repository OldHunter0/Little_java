package chapter2.kebab;

import lombok.ToString;

@ToString
abstract class Kebab {
    public abstract boolean isVeggie();

    public abstract Object whatHolder();
}
