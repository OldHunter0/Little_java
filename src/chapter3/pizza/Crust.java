package chapter3.pizza;

import lombok.ToString;

@ToString
public class Crust extends Pizza{
    @Override
    public Pizza removeAnchovy() {
        return new Crust();
    }

    @Override
    public Pizza topAnchovyWithCheese() {
        return new Crust();
    }

    @Override
    public Pizza subAnchovyByCheese() {
        return new Crust();
    }
}
