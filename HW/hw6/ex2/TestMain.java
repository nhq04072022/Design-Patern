package hw6.ex2;

public class TestMain {
    public static void main() {
        GeometricObject geomObj1 = new Circle(5.0);
        System.out.println(geomObj1);
        System.out.println("Perimeter = " + geomObj1.getPerimeter());
        System.out.println("Area = " + geomObj1.getArea());

        GeometricObject geomObj2 = new Rectangle(4.0, 5.0);
        System.out.println(geomObj2);
        System.out.println("Perimeter = " + geomObj2.getPerimeter());
        System.out.println("Area = " + geomObj2.getArea());

    }
}
