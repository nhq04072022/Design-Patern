package hw3.classes.ex3;

public class TestMain {
    public static void main() {
        // test constructors and toString()
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        // test setter and getter
        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println("length is: " + rectangle1.getLength());
        System.out.println("width is: " + rectangle1.getWidth());

        // test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", rectangle1.getArea());
        System.out.printf("perimeter is: %.2f%n", rectangle1.getPerimeter());
    }
}
