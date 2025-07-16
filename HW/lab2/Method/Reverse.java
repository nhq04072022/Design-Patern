package lab2.Method;

import java.util.Scanner;

public class Reverse {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Reverse array: ");
        reverse(array);
    }

    public static void reverse(int[] array) {
        int array1[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[array.length - i - 1];
            if (i == 0) {
                System.out.print("[" + array1[i] + ",");
            } else if (i == array.length - 1) {
                System.out.print(" " + array1[i] + "]");
            } else {
                System.out.print(" " + array1[i] + ",");
            }
        }
    }
}
