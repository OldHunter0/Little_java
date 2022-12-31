package chapter2.shish;

import lombok.ToString;

@ToString
public class Lamb extends Shish{
    Shish shish;

    public Lamb(Shish shish) {
        this.shish = shish;
    }

    @Override
    public boolean onlyOnions() {
        return onlyOnionsVisitor.forLamb(shish);
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarianVisitor.forLamb(shish);
    }
}
