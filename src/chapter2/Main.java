package chapter2;

import chapter2.kebab.Holder;
import chapter2.kebab.Radish;
import chapter2.kebab.Shallot;
import chapter2.kebab.holders.Dagger;
import chapter2.kebab.holders.Gold;
import chapter2.point.CartesianPoint;
import chapter2.point.ManhattanPoint;
import chapter2.shish.Lamb;
import chapter2.shish.Onion;
import chapter2.shish.Skewer;
import org.junit.Test;

public class Main {

    @Test
    public void testPoint(){
        System.out.println(new ManhattanPoint(3,4).distanceToOrigin());
        System.out.println(new CartesianPoint(3,4).distanceToOrigin());
        System.out.println(new ManhattanPoint(3,4).closerTo(new ManhattanPoint(1,5)));
        System.out.println(new CartesianPoint(3,4).closerTo(new CartesianPoint(1,5)));
    }

    @Test
    public void testShish(){
        Onion x = new Onion(new Skewer());
        System.out.println(x);
        System.out.println(x.onlyOnions());
        System.out.println(x.isVegetarian());
        Lamb x1 = new Lamb(new Onion(new Skewer()));
        System.out.println(x1);
        System.out.println(x1.onlyOnions());
        System.out.println(x1.isVegetarian());
        Onion x2 = new Onion(new Lamb(new Onion(new Skewer())));
        System.out.println(x2);
        System.out.println(x2.onlyOnions());
        System.out.println(x2.isVegetarian());
    }

    @Test
    public void testKebab(){
        Shallot x = new Shallot(new Radish(new Holder(new Dagger())));
        System.out.println(x);
        System.out.println(x.isVeggie());
        System.out.println(x.whatHolder());
        Holder holder = new Holder(new Gold());
        System.out.println(holder.whatHolder());
    }


}
