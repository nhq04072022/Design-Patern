package hw4.ex2;

public class TestMyPolynomial {
    public static void main() {
        // Test constructor
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        // Can also invoke with an array
        double[] coeffs = { 1.2, 3.4, 5.6, 7.8 };
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println("Polynomial p3: " + p3);
    }
}
