package hw2.recursion;

import java.util.Scanner;

public class Gcd {
    public static int gcd(int a, int b) {
        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Gcd is: " + gcd(a, b));
        sc.close();
    }
}
