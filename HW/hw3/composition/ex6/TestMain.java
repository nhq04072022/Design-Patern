package hw3.composition.ex6;

public class TestMain {
    public static void main() {
        // Test program to test all constructors and public methods
        MyPoint point1 = new MyPoint(); // Test constructor
        System.out.println(point1); // Test toString()
        point1.setX(8); // Test setters
        point1.setY(6);
        System.out.println("x is: " + point1.getX()); // Test getters
        System.out.println("y is: " + point1.getY());
        point1.setXY(3, 0); // Test setXY()
        System.out.println(point1.getXY()[0]); // Test getXY()
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(point1.distance(p2)); // which version?
        System.out.println(p2.distance(point1)); // which version?
        System.out.println(point1.distance(5, 6)); // which version?
        System.out.println(point1.distance()); // which version?

        MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
        for (int i = 1; i < 11; i++) {
            points[i - 1] = new MyPoint(i, i); // Allocate each of MyPoint instances
        }
        // use a loop to print all the points
        for (MyPoint temp : points)
            System.out.println(temp);
    }
}
