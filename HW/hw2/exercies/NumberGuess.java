package hw2.exercies;

import java.util.*;

public class NumberGuess {
    public static void main() {
        System.out.println("Key in your guess: ");
        guessNumber();
    }

    public static void guessNumber() {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int trials = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int guess = sc.nextInt();
            trials++;
            if (guess > SECRET_NUMBER)
                System.out.println("Try lower");
            else if (guess < SECRET_NUMBER)
                System.out.println("Try higher");
            else {
                System.out.println("You got it in " + trials + " trial" + (trials == 1 ? "!" : "s!"));
                break;
            }
        }
        sc.close();
    }
}
