package hw1.Nested_Loops;

import java.util.Scanner;

public class SquarePattern {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 0; col < size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        // Rewrite the above program using nested while-do loops.

        // int row = 0;
        // while (row < size) {
        // row++;
        // int col = 0;
        // while (col < size) {
        // col++;
        // System.out.print("# ");
        // }
        // System.out.println();

        // }
    }
}