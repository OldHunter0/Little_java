package chapter2.kebab;

import lombok.ToString;

@ToString
public class Shrimp extends Kebab{
    Kebab k;

    public Shrimp(Kebab k) {
        this.k = k;
    }

    @Override
    public boolean isVeggie() {
        return false;
    }

    @Override
    public Object whatHolder() {
        return k.whatHolder();
    }
}
