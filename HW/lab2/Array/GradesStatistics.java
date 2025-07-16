package lab2.Array;

import java.util.Scanner;

public class GradesStatistics {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int arr[] = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        Average(arr);
        Min(arr);
        Max(arr);
        sc.close();
    }

    public static void Average(int arr[]) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double ave = sum / arr.length;
        System.out.printf("The average is: %.2f", ave);
        System.out.println();
    }

    public static void Min(int arr[]) {
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum is: " + min);
    }

    public static void Max(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The maximum is: " + max);
    }
}
