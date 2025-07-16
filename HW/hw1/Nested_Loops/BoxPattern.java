package hw1.Nested_Loops;

import java.util.Scanner;

public class BoxPattern {
    public static void BoxPatternA(int size) {
        // Outer loop to print each of the rows
        System.out.println("(A)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternB(int size) {
        // Outer loop to print each of the rows
        System.out.println("(B)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternC(int size) {
        System.out.println("(C)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = size; col >= 1; col--) {
                if (row == 1 || row == size || row == col)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void BoxPatternD(int size) {
        // Outer loop to print each of the rows
        System.out.println("(D)");
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) 
                    System.out.print("# ");
            } else {
                for (int col = 0; col < size; col++) {
                    if (col == row || col == size - row - 1) 
                        System.out.print("# ");
                    else 
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        BoxPatternA(size);
        BoxPatternB(size);
        BoxPatternC(size);
        BoxPatternD(size);
    }
}
