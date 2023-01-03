package pie;

import pie.toppings.Fish;

public class SubstFish {
    public Pie forBottom(Fish replacement, Fish object) {
        return new Bottom();
    }

    public Pie forTopping(Fish replacement, Fish object, Object t, Pie r) {
        if (t.equals(object)) {
            return new Topping(replacement, r.substFish(replacement, object));
        } else {
            return new Topping(t, r.substFish(replacement, object));
        }
    }
}
