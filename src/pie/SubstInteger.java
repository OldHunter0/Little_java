package pie;

public class SubstInteger {
    public Pie forBottom(Integer replacement, Integer object) {
        return new Bottom();
    }

    public Pie forTopping(Integer replacement, Integer object, Object t, Pie r) {
        if(object.equals(t)){
            return new Topping(replacement,r.substInteger(replacement, object));
        }else {
            return new Topping(t,r.substInteger(replacement, object));
        }
    }
}
