package pie;

import num.Zero;
import org.junit.Test;
import pie.toppings.Anchovy;
import pie.toppings.Salmon;
import pie.toppings.Tuna;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Topping(new Anchovy(), new Topping(new Tuna(), new Topping(new Anchovy(), new Bottom()))));
        System.out.println(new Anchovy().equals(new Anchovy()));
    }

    @Test
    public void testRemoveFish(){
        Topping pie = new Topping(new Anchovy(), new Bottom());
        System.out.println(pie.remFish(new Anchovy()));
    }

    @Test
    public void testRemove(){
        Topping pie = new Topping(new Anchovy(), new Bottom());
        System.out.println(pie.rem(new Anchovy()));
        System.out.println(new Topping(2,new Topping(3,new Topping(2,new Bottom()))).rem(3));
        System.out.println(new Topping(new Anchovy(),new Topping(3,new Topping(new Salmon(),new Bottom()))).rem(3));
        System.out.println(new Topping(new Anchovy(),new Topping(new Integer(3),new Topping(new Zero(),new Bottom()))).rem(new Zero()));
        System.out.println(new Topping(new Anchovy(),new Topping(new Tuna(),new Topping(new Anchovy(),new Bottom()))));
    }

    @Test
    public void testSubst(){
        System.out.println(new Topping(new Anchovy(),
                new Topping(new Tuna(),
                        new Topping(new Anchovy(),
                                new Bottom())))
                .substFish(new Salmon(),new Anchovy()));
        System.out.println(new Topping(new Anchovy(),
                new Topping(new Tuna(),
                        new Topping(new Anchovy(),
                                new Bottom())))
                .subst(new Salmon(),new Anchovy()));
        System.out.println(new Topping(5,
                new Topping(2,
                        new Topping(5,
                                new Topping(new Anchovy(),
                                        new Bottom()))))
                .substInteger(99,5));
        System.out.println(new Topping(5,
                new Topping(2,
                        new Topping(5,
                                new Topping(new Anchovy(),
                                        new Bottom()))))
                .subst(99,5));


    }


}
