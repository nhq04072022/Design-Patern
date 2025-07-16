package lab1.exercises;

import java.util.Scanner;

public class CheckOddEven {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Try number = 0, 1, 88, 99, -1, -2 and verify your results
        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println("The number is " + number);
        if (number % 2 == 0) {
            System.out.println("Even Number"); // even number
        } else {
            System.out.println("Odd Number"); // odd number
        }
        System.out.println("bye!");
    }
}
