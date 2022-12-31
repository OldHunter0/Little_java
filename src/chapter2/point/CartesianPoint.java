package chapter2.point;

public class CartesianPoint extends Point {
    public CartesianPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public int distanceToOrigin() {
        return (int) Math.sqrt(x * x + y * y);
    }

}
