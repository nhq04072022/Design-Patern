package lab1.exercises;

import java.util.*;

public class PrintDayInWord {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
        int dayNumber = Integer.parseInt(sc.nextLine());
        sc.close();

        // Using nested-if
        if (dayNumber == 0) { // Use == for comparison
            System.out.println("SUNDAY");
        } else if (dayNumber == 1) {
            System.out.println("MONDAY");
        } else if (dayNumber == 2) {
            System.out.println("TUESDAY");
        } else if (dayNumber == 3) {
            System.out.println("WEDNESDAY");
        } else if (dayNumber == 4) {
            System.out.println("THURSDAY");
        } else if (dayNumber == 5) {
            System.out.println("FRIDAY");
        } else if (dayNumber == 6) {
            System.out.println("SATURDAY");
        } else {
            System.out.println("NOT a valid day");
        }

        // Using switch-case-default
        switch (dayNumber) {
            case 0:
                System.out.println("SUNDAY");
                break; // Don't forget the "break" after each case!
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
