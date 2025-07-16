package lab2.Method;

import java.util.*;

public class CopyOf {
    public static int[] copyOf(int[] array){
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int items;
        int[] array;

        System.out.print("Enter size of array: ");
        items = sc.nextInt();
        array = new int[items];

        System.out.print("Enter " + items + " items in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Original Array" + Arrays.toString(array));
        System.out.println("Copy of Array" + Arrays.toString(copyOf(array)));
    }
}
