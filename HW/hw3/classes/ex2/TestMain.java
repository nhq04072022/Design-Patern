package hw3.classes.ex2;

public class TestMain {
    public static void main() {
        // test constructors and toString()
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);

        Circle circle2 = new Circle();
        System.out.println(circle2);

        // test setter and getter
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        // test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
