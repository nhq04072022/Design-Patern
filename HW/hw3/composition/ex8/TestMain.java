package hw3.composition.ex8;

public class TestMain {
    public static void main() {
        MyCircle c1 = new MyCircle(3, 0, 3);
        MyCircle c2 = new MyCircle(new MyPoint(1, 1), 5);

        System.out.println("Circle c1: " + c1);
        System.out.println("Circle c2: " + c2);

        c1.setRadius(5);
        System.out.println("Radius of circle c1 now is " + c1.getRadius());

        c2.setCenterXY(3, 3);
        System.out.println("Center of circle c2 now is " + c2.getCenter());

        c1.setCenter(new MyPoint(4, 4));
        System.out.println("Center of circle c1 now is " + c1.getCenter());

        c2.setCenterX(5);
        System.out.println("CenterX of circle c2 now is " + c2.getCenterX());

        c1.setCenterY(3);
        System.out.println("CenterY of circle c1 now is " + c1.getCenterY());

        System.out.println("Center of circle c1 now is " + c1.getCenter());
        System.out.println("Center of circle c2 now is " + c2.getCenter());
        System.out.println("Area of circle c1 is " + c1.getArea());
        System.out.println("Circumference of circle c2 is " + c2.getCircumference());
        System.out.println("Distance between centers is " + c1.distance(c2));
    }
}
