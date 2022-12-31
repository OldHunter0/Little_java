package pie.toppings;

import lombok.ToString;

@ToString
public class Tuna extends Fish{
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tuna;
    }
}
