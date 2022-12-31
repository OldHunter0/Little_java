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
}
