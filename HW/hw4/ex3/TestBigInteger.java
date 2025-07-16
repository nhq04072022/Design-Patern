package hw4.ex3;

import java.math.*;

public class TestBigInteger {
    public static void main() {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        System.out.println("Sum 2 Big Interger: " + i1.add(i2));
        System.out.println("Subtract 2 Big Interger: " + i1.subtract(i2));
        System.out.println("Multiply 2 Big Interger: " + i1.multiply(i2));
    }
}
