package practiceweek123;

public class TestComplex {

    public static void main(String[] args) {
        // Testing ComplexCart
        Complex a = new Complex(10.0, 12.0);
        Complex b = new Complex(1.0, 2.0);

        System.out.println("Testing ComplexCart:");
        a.add(b);
        System.out.println("a = a + b is " + a);
        a.minus(b);
        System.out.println("a - b (which is the original a) is " + a);
        System.out.println("Angle of a is " + a.angle());
        a.times(b);
        System.out.println("a = a * b is " + a);
    }
}
