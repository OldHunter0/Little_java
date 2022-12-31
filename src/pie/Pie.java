package pie;

import lombok.ToString;
import pie.toppings.Fish;

@ToString
public abstract class Pie {
    RemA remAFunction = new RemA();

    RemFish remFishFunction = new RemFish();

    RemInteger remIntegerFunction=new RemInteger();

    Rem remFunction=new Rem();

    abstract Pie remA();

    abstract Pie remFish(Fish fish);

    abstract Pie remInteger(Integer i);

    abstract Pie rem(Object o);
}
