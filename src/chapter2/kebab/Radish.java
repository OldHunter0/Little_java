package chapter2.kebab;

import lombok.ToString;

@ToString
public class Radish extends Kebab{
    Kebab k;

    public Radish(Kebab k) {
        this.k = k;
    }

    @Override
    public boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    public Object whatHolder() {
        return k.whatHolder();
    }
}
