package chapter3.pizza;

import lombok.ToString;

@ToString
public class Cheese extends Pizza {
    Pizza p;

    public Cheese(Pizza p) {
        this.p = p;
    }

    @Override
    public Pizza removeAnchovy() {
        return new Cheese(p.removeAnchovy());
    }

    @Override
    public Pizza topAnchovyWithCheese() {
        return new Cheese(p.topAnchovyWithCheese());
    }

    @Override
    public Pizza subAnchovyByCheese() {
        return new Cheese(p.subAnchovyByCheese());
    }
}
