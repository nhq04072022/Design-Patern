package lab2.Method;

import java.util.*;

public class ArrayToString {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int items = sc.nextInt();
        int[] array = new int[items];

        System.out.println("Add " + items + " items separated by spaces");
        for (int count = 0; count < items; count++) {
            array[count] = sc.nextInt();
        }
        System.out.println(arrayToString(array));
        sc.close();
    }

    public static String arrayToString(int[] array) {
        return Arrays.toString(array);

    }
}
