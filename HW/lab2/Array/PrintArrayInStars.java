package lab2.Array;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main() {
        final int NUM_ITEMS;
        int[] items;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        
        System.out.print("Enter the value of all items (separated) by space): ");
        inputArray(items, sc);
        printArray(items);

    }

    public static int[] inputArray(int[] items, Scanner sc) {
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        return items;
    }

    public static void printArray(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int starNo = 1; starNo <= items[i]; starNo++) {
                System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
