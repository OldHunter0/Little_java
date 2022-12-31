package pie;

public class Rem {
    public Pie forTopping(Object o,Object t, Pie r) {
        if(o.equals(t)){
            return r.rem(o);
        }else {
            return new Topping(t,r.rem(o));
        }
    }

    public Pie forBottom(Object o) {
        return new Bottom();
    }
}
