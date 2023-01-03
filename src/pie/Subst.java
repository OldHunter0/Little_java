package pie;

public class Subst {
    public Pie forBottom(Object replacement, Object object) {
        return new Bottom();
    }

    public Pie forTopping(Object replacement, Object object, Object t, Pie r) {
        if (object.equals(t)) {
            return new Topping(replacement, r.subst(replacement, object));
        } else {
            return new Topping(t, r.subst(replacement, object));
        }
    }
}
