package chapter3.pizza;

import lombok.ToString;

@ToString
public class Sausage extends Pizza {
    Pizza p;

    public Sausage(Pizza p) {
        this.p = p;
    }

    @Override
    public Pizza removeAnchovy() {
        return new Sausage(p.removeAnchovy());
    }

    @Override
    public Pizza topAnchovyWithCheese() {
        return new Sausage(p.topAnchovyWithCheese());
    }

    @Override
    public Pizza subAnchovyByCheese() {
        return new Sausage(p.subAnchovyByCheese());
    }
}
