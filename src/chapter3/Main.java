package chapter3;

import chapter3.pizza.*;
import org.junit.Test;

public class Main {
    @Test
    public void testRemoveA(){
        Pizza pizza=new Sausage(new Olive(new Anchovy(new Sausage(new Cheese(new Crust())))));
        System.out.println(pizza);
        System.out.println(pizza.removeAnchovy());
        Pizza pizza1=new Anchovy(new Olive(new Anchovy(new Anchovy(new Cheese(new Crust())))));
        System.out.println(pizza1.removeAnchovy());
    }

    @Test
    public void test2(){
        Pizza pizza=(new Olive(new Anchovy(new Cheese(new Anchovy(new Crust())))).removeAnchovy()).topAnchovyWithCheese();
        System.out.println(pizza);
        Pizza pizza1=(new Olive(new Anchovy(new Cheese(new Anchovy(new Crust())))).topAnchovyWithCheese()).removeAnchovy();
        System.out.println(pizza1);
    }

}
