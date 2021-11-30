package guru.qa;

import java.util.Arrays;
import java.util.List;

public class PointExample {public static void main(String[] args) {

    Point p1 = new Point(5, 5),
            p2 = new Point(6, 7),
            p3 = new Point(1, 3);


    Point[] pointArray = {p1, p2, p3};

    Arrays.sort(pointArray, Point.getXComparator());

    System.out.println("By x");
    for (Point element : pointArray) {
        System.out.println(element);
    }

    Arrays.sort(pointArray, Point.getYComparator());

    System.out.println("By y");
    for (Point element : pointArray) {
        System.out.println(element);
    }

    List<Point> pointList = Arrays.asList(p1, p2, p3);

    pointList.sort(Point.getXComparator());

    System.out.println("By х");
    for (Point element : pointList) {
        System.out.println(element);
    }

    pointList.sort(Point.getYComparator());

    System.out.println("By y");
    for (Point element : pointList) {
        System.out.println(element);
    }
}

}
