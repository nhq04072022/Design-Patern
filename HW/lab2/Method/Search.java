package lab2.Method;

import java.util.Scanner;

public class Search {
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();
        System.out.print(search(array, key));
    }
}
