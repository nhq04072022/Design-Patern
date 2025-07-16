package lab1.input_decision_and_loop;

import java.util.*;

public class ReverseInt {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Declare variables
        System.out.print("Enter a positive integer: ");
        int inNumber = Integer.parseInt(sc.nextLine()); // to be input
        int inDigit; // each digit

        System.out.print("The reverse is: ");
        // Extract and drop the "last" digit repeatably using a while-loop with
        // modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            // Print this digit (which is extracted in reverse order)
            System.out.print(inDigit);
            inNumber /= 10; // drop "last" digit and repeat
        }
        sc.close();
    }
}
