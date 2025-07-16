package lab2.Method;

import java.util.Scanner;

public class Equals{
    public static boolean equals(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i] && array1.length == array2.length) {
                return true;
            }
        }
        return false;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number of elements of the array2: ");
        int n2 = sc.nextInt();

        int array1[] = new int[n1];
        int array2[] = new int[n2];
        System.out.print("Enter the array1: ");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter the array2: ");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(equals(array1, array2));
    }
}
