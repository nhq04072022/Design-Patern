package lab1.input_decision_and_loop;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main() {
        // Declare variables
        int number1, number2, number3; // The 3 input integers
        int sum, product, min, max; // To compute these

        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter number 1: ");
        number1 = Integer.parseInt(in.nextLine());
        System.out.print("Enter number 2: ");
        number2 = Integer.parseInt(in.nextLine());
        System.out.print("Enter number 3: ");
        number3 = Integer.parseInt(in.nextLine());

        in.close();
        // Compute sum and product
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);

        // Compute min
        // The "coding pattern" for computing min is:
        // 1. Set min to the first item
        // 2. Compare current min with the second item and update min if second item is
        // smaller
        // 3. Repeat for the next item
        max = number1;
        min = number1; // Assume min is the 1st item
        if (number2 < min) { // Check if the 2nd item is smaller than current min
            min = number2; // Update min if so
        }
        if (number3 < min) { // Continue for the next item
            min = number3;
        }
        // Compute max - similar to min
        if (number2 > number1)
            max = number2;
        if (number3 > number2)
            max = number3;

        // Print results
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);

        // T number1

        // Scanner in = new Scanner(System.in);
        // int number1 = Integer.parseInt(in.nextLine());
        // int number2 = Integer.parseInt(in.nextLine());
        // int number3 = Integer.parseInt(in.nextLine());
        // int number4 = Integer.parseInt(in.nextLine());
        // int number5 = Integer.parseInt(in.nextLine());

        // int sum = number1 + number2 + number3 + number4 + number5;
        // int product = number1 * number2 * number3 * number4 * number5;

        // int min = number1;
        // int max = number1;

        // System.out.println("The sum is: " + sum);
        // System.out.println("The product is: " + product);

        // if (number2 < min) min = number2;
        // if (number3 < min) min = number3;
        // if (number4 < min) min = number4;
        // if (number5 < min) min = number5;

        // if (number2 > max) max = number2;
        // if (number3 > max) max = number3;
        // if (number4 > max) max = number4;
        // if (number5 > max) max = number5;

        // System.out.println("The min is: " + min);
        // System.out.println("The max is: " + max);

    }
}
