package pie;

import pie.toppings.Anchovy;

public class RemA {
    public Pie forTopping(Object t, Pie r) {
        if (new Anchovy().equals(t)) {
            return r.remA();
        } else {
            return new Topping(t, r.remA());
        }
    }

    public Pie forBottom() {
        return new Bottom();
    }
}
