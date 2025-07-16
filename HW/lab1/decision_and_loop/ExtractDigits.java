package lab1.decision_and_loop;

import java.util.*;

public class ExtractDigits {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        while (n > 0) {
            int digit = n % 10; // Extract the least-significant digit
            // Print this digit
            System.out.print(digit + " ");
            n = n / 10; // Drop the least-significant digit and repeat the loop
        }
    }
}
