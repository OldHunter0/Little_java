package chapter2.shish;

import lombok.ToString;

@ToString
public abstract class Shish {
    OnlyOnions onlyOnionsVisitor;
    IsVegetarian isVegetarianVisitor;

    public abstract boolean onlyOnions();

    public abstract boolean isVegetarian();
}
