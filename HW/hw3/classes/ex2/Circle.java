package hw3.classes.ex2;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // dien tich
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // chu vi
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
