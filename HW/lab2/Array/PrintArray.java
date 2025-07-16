package lab2.Array;

import java.util.Scanner;

public class PrintArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        inputArray(items, sc);

        System.out.print("The values are: ");
        printArray(items);

    }
    public static int[] inputArray(int[] items, Scanner sc){
        if (items == null) {
            return null;
        }
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        return items;
    }

    public static void printArray(int[] items){
        if (items == null) {
            return;
        }
        
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[0]);
            } else if (i == items.length - 1) {
                System.out.print(" ," + items[i] + "]");
            } else {
                System.out.print(", " + items[i]);
            }
        }
    }
}
