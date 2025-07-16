package hw4.ex1;

public class TestMyComplex {
    public static void main() {
        // Test contructor
        MyComplex myComplex1 = new MyComplex(1.1, 2.2);
        MyComplex myComplex2 = new MyComplex(3.3, 4.4);

        // Test getter

        System.out.println("Enter complex number 1 (real and imaginary part): " + myComplex1.getReal() + " "
                + myComplex1.getImag());
        System.out.println("Enter complex number 2 (real and imaginary part): " + myComplex2.getReal() + " "
                + myComplex2.getImag());

        // Test isReal() and isImag
        System.out.println("Number 1 is: " + myComplex1);
        System.out.println(myComplex1 + " is " + (myComplex1.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println(myComplex1 + " is " + (myComplex1.isImaginary() ? "" : "NOT") + " a pure imaginary number");

        System.out.println("Number 2 is: " + myComplex2);
        System.out.println(myComplex2 + " is " + (myComplex2.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println(myComplex2 + " is " + (myComplex2.isImaginary() ? "" : "NOT") + " a pure imaginary number");

        // Test equal()
        System.out.println(
                myComplex1 + " is " + (myComplex1.equals(myComplex2) ? "" : "NOT") + " equal to " + myComplex2);

        // Test addInto()
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.addNew(myComplex2));
        System.out.println(myComplex1 + " - " + myComplex2 + " = " + myComplex1.subtractNew(myComplex2));
        System.out.println(myComplex1 + " * " + myComplex2 + " = " + myComplex1.multiply(myComplex2));
        System.out.println(myComplex1 + " / " + myComplex2 + " = " + myComplex1.divide(myComplex2));
    }
}
