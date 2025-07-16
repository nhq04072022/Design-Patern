package hw5.composition_and_inheritance.ex1;

public class TestPoint {
    public static void main() {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1);
    }
}
