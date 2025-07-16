package hw5.composition_and_inheritance.ex2;

public class Cylinder {
    private Circle base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        this(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * base.getRadius() * height * Math.PI + 2 * base.getArea();
    }

    public double getVolume() {
        return height * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
