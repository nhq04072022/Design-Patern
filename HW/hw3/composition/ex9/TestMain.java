package hw3.composition.ex9;

public class TestMain {
    public static void main() {
        MyTriangle t1 = new MyTriangle(1, 1, 3, 5, 6, 2);
        MyTriangle t2 = new MyTriangle(new MyPoint(1, 1), new MyPoint(2, 2), new MyPoint(3, 3));

        System.out.println(t1 + " is " + t1.getType() + " and has perimeter: " + t1.getPerimeter());
        System.out.println(t2 + " is " + t2.getType() + " and has perimeter: " + t2.getPerimeter());
    }
}
