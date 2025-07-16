package hw1.Nested_Loops;

import java.util.Scanner;

public class HillPattern {
    public static void HillPatternA(int size) {
        System.out.println("(A)");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1)
                    System.out.print("# ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void HillPatternB(int size) {
        System.out.println("(B)");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= row)
                    System.out.print("# ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void HillPatternC(int size) {
        System.out.println("(C)");

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.printf("%2s", "#");
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }

        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                if (row + col <= 2 * size && row <= col) {

                    System.out.printf("%2s", "#");
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void HillPatternD(int size) {
        System.out.println("(D)");
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= (2 * size); col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.printf("%2s", " ");
                } else {
                    System.out.printf("%2s", "#");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size + 1; row++) {
            for (int col = 0; col <= (2 * size); col++) {
                if (row + col <= (2 * size) && row <= col) {

                    System.out.printf("%2s", " ");
                } else {
                    System.out.printf("%2s", "#");
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

        HillPatternA(size);
        HillPatternB(size);
        HillPatternC(size);
        HillPatternD(size);
    }
}
