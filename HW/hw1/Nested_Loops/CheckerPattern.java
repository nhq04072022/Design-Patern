package hw1.Nested_Loops;

import java.util.Scanner;

public class CheckerPattern {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 0; col < size; col++) {
                if(row % 2 == 0) System.out.print(" #");
                else System.out.print("# ");
            }
            System.out.println();
        }
    }
}
