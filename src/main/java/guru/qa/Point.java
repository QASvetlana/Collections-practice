package guru.qa;

import java.util.Comparator;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Comparator<Point> getXComparator() {
        Comparator<Point> xComparator = (o1, o2) -> o1.x - o2.x;
        return xComparator;
    }

    public static Comparator<Point> getYComparator() {
        Comparator<Point> yComparator = (o1, o2) -> o1.y - o2.y;
        return yComparator;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}