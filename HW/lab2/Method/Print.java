package lab2.Method;

import java.util.Scanner;

public class Print {
    public static void printA(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + " ,");
            }
        }
    }
    
    public static void printB(double[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + " ,");
            }
        }
    }

    public static void printC(float[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextFloat();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + " ,");
            }
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Int");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        printA(array1, sc);

        System.out.println();
        System.out.println("Array Double");
        double[] array2 = new double[n];
        printB(array2, sc);

        System.out.println();
        System.out.println("Array Float");
        float[] array3 = new float[n];
        printC(array3, sc);
    }
}
