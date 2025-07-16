package hw2.sort_and_search;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        int[] array = { 22, 33, 44, 55, 11, 21, 77 };
        System.out.print("Enter the element to search in the array: ");
        int key = sc.nextInt();
        sc.close();
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
    }
}
