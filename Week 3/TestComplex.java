public class TestComplex {

    public static void main(String[] args) {
        
        Complex a = new Complex(10.0, 12.0);
        Complex b = new Complex(1.0, 2.0);

        System.out.println("Testing ComplexCart:");
        a.add(b);
        System.out.println("a = a + b is " + a);
        a.minus(b);
        System.out.println("a - b (which is the original a) is " + a);
        a.times(b);
        System.out.println("a = a * b is " + a);
    }
}
