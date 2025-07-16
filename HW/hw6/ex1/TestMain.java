package hw6.ex1;

public class TestMain {
    public static void main() {

        Shape shape1 = new Circle(5.5, "RED", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius()); ERROR: class Shape does not have
        // getRadius() method !!!

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        // Shape shape2 = new Shape(); ERROR: Shape is abstract; cannot be instantiated

        Shape shape3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // System.out.println(shape3.getLength()); ERROR: class Shape does not have
        // getLength() method !!!

        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        // System.out.println(shape4.getSide()); // ERROR: class Shape does not have
        // getSide() method !!!

        // Take note that we downcast Shape shape4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        // System.out.println(rectangle2.getSide()); // ERROR: class Rectangle does not
        // have getSide() method !!!
        System.out.println(rectangle2.getLength());

        // Downcast Rectangle rectangle2 to Square
        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

    }

}
