package hw1.Nested_Loops;

import java.util.Scanner;

public class TimeTable {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        System.out.print("* " + "|");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i); //%d Số thập phân (số nguyên) (cơ số 10)
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.print("-----");
        }

        tinhCuuChuong(size);
    }

    public static void tinhCuuChuong(int size) {
        // Outer loop to print each of the rows
        for (int col = 1; col <= size; col++) { // row = 1 , 2 , 3 , . . . , s i z e
            // Inner loop to print each of the columns of a particular row
            System.out.println();
            System.out.print(col + " |");
            for (int row = 1; row <= size; row++) {
                System.out.printf("%4d", (row * col));
            }
        }
    }
}
