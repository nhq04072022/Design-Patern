package lab2.Method;

import java.util.*;

public class Exponent {
    public static int exponent(int base, int exp){
        int product = 1;

        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        sc.close();

        System.out.print(base + " raises to the power of " + exponent + " is: " + exponent(base, exponent));
    }
}
