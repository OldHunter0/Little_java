package chapter2.kebab;

import lombok.ToString;

@ToString
public class Holder extends Kebab{
    Object o;

    public Holder(Object o) {
        this.o = o;
    }

    @Override
    public boolean isVeggie() {
        return true;
    }

    @Override
    public Object whatHolder() {
        return o;
    }
}
