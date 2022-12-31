package pie;

import pie.toppings.Anchovy;
import pie.toppings.Fish;

public class RemFish {
    public Pie forTopping(Fish fish, Object t, Pie r) {
        if (fish.equals(t)) {
            return r.remFish(fish);
        } else {
            return new Topping(t, r.remFish(fish));
        }
    }

    public Pie forBottom(Fish fish) {
        return new Bottom();
    }
}
