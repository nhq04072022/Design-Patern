package hw1.Nested_Loops;

import java.util.Scanner;

public class TriangularPattern {
    public static void TriangularPatternA(int size) {
        // Outer loop to print each of the rows
        System.out.println("(A)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row >= col)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternB(int size) {
        // Outer loop to print each of the rows
        System.out.println("(B)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternC(int size) {
        System.out.println("(C)");

        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (col >= row)
                    System.out.printf("%2s", "#"); // %s chuoi
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternD(int size) {
        System.out.println("(D)");
        for (int row = 1; row <= size; row++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1)
                    System.out.printf("%2s", "#");
                else
                    System.out.printf("%2s", " ");
            }
            System.out.println();
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        TriangularPatternA(size);
        TriangularPatternB(size);
        TriangularPatternC(size);
        TriangularPatternD(size);
    }
}
