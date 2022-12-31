package chapter2.shish;

import lombok.ToString;

@ToString
public class Tomato extends Shish {
    Shish shish;

    public Tomato(Shish shish) {
        this.shish = shish;
    }

    @Override
    public boolean onlyOnions() {
        return onlyOnionsVisitor.forTomato(shish);
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarianVisitor.forTomato(shish);
    }
}
