package chapter2.shish;

import lombok.ToString;

@ToString
public class Onion extends Shish{
    Shish shish;

    public Onion(Shish shish) {
        this.shish = shish;
    }

    @Override
    public boolean onlyOnions() {
        return onlyOnionsVisitor.forOnion(shish);
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarianVisitor.forOnion(shish);
    }
}
