package hw3.composition.ex7;

public class TestMain {
    public static void main() {
        MyLine myLine1 = new MyLine(4, 5, 7, 10);
        MyLine myLine2 = new MyLine(new MyPoint(1, 2), new MyPoint(8, 9));

        System.out.println("Line 1: " + myLine1);
        System.out.println("Line 2: " + myLine2);

        System.out.println("Line 1 length: " + myLine1.getLength());
        System.out.println("Line 1 gradient: " + myLine1.getGradient());

        System.out.println("Line 2 length: " + myLine2.getLength());
        System.out.println("Line 2 gradient: " + myLine2.getGradient());
    }
}
