package pie;

import lombok.ToString;
import pie.toppings.Fish;

@ToString
public class Bottom extends Pie{
    @Override
    Pie remA() {
        return remAFunction.forBottom();
    }

    @Override
    Pie remFish(Fish fish) {
        return remFishFunction.forBottom(fish);
    }

    @Override
    Pie remInteger(Integer i) {
        return remIntegerFunction.forBottom(i);
    }

    @Override
    Pie rem(Object o) {
        return remFunction.forBottom(o);
    }

    @Override
    Pie substFish(Fish replacement, Fish object) {
        return substFishFunction.forBottom(replacement,object);
    }

    @Override
    Pie substInteger(Integer replacement, Integer object) {
        return substIntegerFunction.forBottom(replacement,object);
    }

    @Override
    Pie subst(Object replacement, Object object) {
        return substFunction.forBottom(replacement,object);
    }

}
