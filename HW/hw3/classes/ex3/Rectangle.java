package hw3.classes.ex3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    // chu vi
    public double getPerimeter() {
        return 2 * (width * length);
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + length + " width = " + width + "]";
    }

}
