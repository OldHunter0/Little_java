package chapter3.pizza;

import lombok.ToString;

@ToString
public class Anchovy extends Pizza{
    Pizza p;

    public Anchovy(Pizza p) {
        this.p = p;
    }

    @Override
    public Pizza removeAnchovy() {
        return p.removeAnchovy();
    }

    @Override
    public Pizza topAnchovyWithCheese() {
        return new Cheese(new Anchovy(p.topAnchovyWithCheese()));
    }

    @Override
    public Pizza subAnchovyByCheese() {
        return new Cheese(p.subAnchovyByCheese());
    }
}
