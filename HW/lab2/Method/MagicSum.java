package lab2.Method;

import java.util.*;

public class MagicSum {
    public static boolean hasEight(int number){
        if (number == 8)
            return true;

        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();

        while (number != SENTINEL) {

            if (hasEight(number) == true) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();

        }

        System.out.print("The magic sum is: "+ sum);
        sc.close();
    }
}
