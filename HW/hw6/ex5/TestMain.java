package hw6.ex5;

public class TestMain {
    public static void main() {
        GeometricObject geomObj1 = new Circle(5.0);
        System.out.println(geomObj1);
        System.out.println("Perimeter = " + geomObj1.getPerimeter());
        System.out.println("Area = " + geomObj1.getArea());

        Resizable geomObj2 = new ResizableCircle(5.0);
        System.out.println(geomObj2);
        geomObj2.resize(50);
        System.out.println(geomObj2);

        GeometricObject geomObj3 = (GeometricObject) geomObj2;
        System.out.println(geomObj3);
        System.out.println("Perimeter = " + geomObj3.getPerimeter());
        System.out.println("Area = " + geomObj3.getArea());
    }
}
