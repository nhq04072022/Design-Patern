package hw3.composition.ex10;

public class TestMain {
    public static void main() {
        MyRectangle r1 = new MyRectangle(0, 1, 2, 0);
        MyRectangle r2 = new MyRectangle(new MyPoint(0, 2), new MyPoint(3, 1));

        System.out.println(r1 + " has perimeter: " + r1.getPerimeter());
        System.out.println(r2 + " has area: " + r2.getArea());
    }
}
