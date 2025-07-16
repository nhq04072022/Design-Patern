package lab1.exercises;

import java.util.*;

public class CheckPassFail {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Try mark = 0, 49, 50, 51, 100 and verify your results.
        int mark = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println("The mark is: " + mark);

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}