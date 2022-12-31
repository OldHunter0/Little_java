package pie;

import lombok.ToString;
import pie.toppings.Fish;

@ToString
public class Topping extends Pie {
    Object t;
    Pie r;

    public Topping(Object t, Pie r) {
        this.t = t;
        this.r = r;
    }

    @Override
    Pie remA() {
        return remAFunction.forTopping(t, r);
    }

    @Override
    Pie remFish(Fish fish) {
        return remFishFunction.forTopping(fish, t, r);
    }

    @Override
    Pie remInteger(Integer i) {
        return remIntegerFunction.forTopping(i, t, r);
    }

    @Override
    Pie rem(Object o) {
        return remFunction.forTopping(o, t, r);
    }
}
