package pie;

import lombok.ToString;
import pie.toppings.Fish;

@ToString
public abstract class Pie {
    RemA remAFunction = new RemA();

    RemFish remFishFunction = new RemFish();

    RemInteger remIntegerFunction = new RemInteger();

    SubstFish substFishFunction = new SubstFish();

    SubstInteger substIntegerFunction = new SubstInteger();

    Subst substFunction=new Subst();

    Rem remFunction = new Rem();

    abstract Pie remA();

    abstract Pie remFish(Fish fish);

    abstract Pie remInteger(Integer i);

    abstract Pie rem(Object o);

    abstract Pie substFish(Fish replacement, Fish object);

    abstract Pie substInteger(Integer replacement, Integer object);

    abstract Pie subst(Object replacement, Object object);
}
