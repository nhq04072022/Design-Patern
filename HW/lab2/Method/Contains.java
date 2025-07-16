package lab2.Method;

import java.util.Scanner;

public class Contains {
    public static boolean contains(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(contains(array, key));
    }
}
