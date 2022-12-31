package chapter2.point;

abstract class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int distanceToOrigin();

    public boolean closerTo(Point p) {
        return distanceToOrigin() <= p.distanceToOrigin();
    }
}
