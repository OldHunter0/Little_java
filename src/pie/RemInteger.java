package pie;

public class RemInteger {
    public Pie forTopping(Integer i, Object t, Pie r) {
        if (i.equals(t)) {
            return r.remInteger(i);
        } else {
            return new Topping(t, r.remInteger(i));
        }
    }

    public Pie forBottom(Integer i) {
        return new Bottom();
    }
}
