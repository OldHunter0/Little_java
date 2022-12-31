package chapter3.pizza;

import lombok.ToString;

@ToString
public abstract class Pizza {
    public abstract Pizza removeAnchovy();

    public abstract Pizza topAnchovyWithCheese();

    public abstract Pizza subAnchovyByCheese();
}

