package chapter2.kebab;

import lombok.ToString;

@ToString
public class Shallot extends Kebab{
    Kebab k;

    public Shallot(Kebab k) {
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
