package chapter3.pizza;

import lombok.ToString;

@ToString
public class Olive extends Pizza {
    Pizza p;

    public Olive(Pizza p) {
        this.p = p;
    }

    @Override
    public Pizza removeAnchovy() {
        return new Olive(p.removeAnchovy());
    }

    @Override
    public Pizza topAnchovyWithCheese() {
        return new Olive(p.topAnchovyWithCheese());
    }

    @Override
    public Pizza subAnchovyByCheese() {
        return new Olive(p.subAnchovyByCheese());
    }
}
