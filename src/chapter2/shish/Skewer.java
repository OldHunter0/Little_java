package chapter2.shish;

import lombok.ToString;

@ToString
public class Skewer extends Shish {
    @Override
    public boolean onlyOnions() {
        return onlyOnionsVisitor.forSkewer();
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarianVisitor.forSkewer();
    }

}
