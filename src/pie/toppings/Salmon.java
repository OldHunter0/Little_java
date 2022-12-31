package pie.toppings;

import lombok.ToString;

@ToString
public class Salmon extends Fish{
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Salmon;
    }
}
