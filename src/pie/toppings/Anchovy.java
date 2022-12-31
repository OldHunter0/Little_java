package pie.toppings;

import lombok.ToString;

@ToString
public class Anchovy extends Fish{
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Anchovy;
    }
}
