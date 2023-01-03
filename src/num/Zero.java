package num;

import lombok.ToString;

@ToString
public class Zero extends Num{
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Zero;
    }
}
