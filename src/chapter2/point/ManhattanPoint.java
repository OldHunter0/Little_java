package chapter2.point;

public class ManhattanPoint extends Point {
    public ManhattanPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public int distanceToOrigin() {
        return x + y;
    }
}
