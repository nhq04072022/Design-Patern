package hw2.recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main() {
        int n = 9;
        System.out.println("Factorial of " + n + " is :" + factorial(n));
    }
}
