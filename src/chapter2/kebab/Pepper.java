package chapter2.kebab;

public class Pepper extends Kebab {
    Kebab k;

    public Pepper(Kebab k) {
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
