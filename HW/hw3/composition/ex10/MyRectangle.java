package hw3.composition.ex10;

public class MyRectangle {
    private MyPoint r1;
    private MyPoint r2;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        r1 = new MyPoint(x1, y1);
        r2 = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint r1, MyPoint r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public String toString() {
        return "MyRectangle[r1=" + r1 + ",r2=" + r2 + "]";
    }

    public double getPerimeter() {
        MyPoint r3 = new MyPoint();
        r3.setXY(r2.getX(), r1.getY());
        return 2 * (r1.distance(r3) + r3.distance(r2));
    }

    public double getArea() {
        MyPoint r3 = new MyPoint();
        r3.setXY(r2.getX(), r1.getY());
        return r1.distance(r3) * r3.distance(r2);
    }
}
