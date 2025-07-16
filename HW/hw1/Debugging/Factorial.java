package hw1.Debugging;

public class Factorial {
    public static void main() {
        // Print factorial of n
        int n = 20;
        long factorial = 1;

        // n! = 1*2*3*..*n
        for (int i = 1; i <= n; i++) { // error i = 0 -> i = 1 and i < n -> i <= n
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
