package lab1.input_decision_and_loop;

import java.util.Scanner;

public class CircleComputation {
    public static void main() {
        Scanner in = new Scanner(System.in);
        // Declare variables
        double radius, diameter, circumference, area; // inputs and results - all in double

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = Double.parseDouble(in.nextLine()); // read input as double
        in.close();

        // Compute in "double"
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        // Print results using printf() with the following format specifiers:
        // %.2f for a double with 2 decimal digits
        // %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);

        // TRY
        // 1. ShaereComputation
        // Scanner in = new Scanner(System.in);
        // float radius;
        // radius = Float.parseFloat(in.nextLine());
        // double surfaceArea;
        // double volume;

        // surfaceArea = (4 * Math.PI * radius * radius);
        // volume = (4 / 3) * Math.PI * radius * radius * radius;

        // System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        // System.out.printf("Volume is: %.2f%n", volume);

        // 2.CyliderComputation
        // Scanner in = new Scanner(System.in);

        // float radius = Float.parseFloat(in.nextLine());
        // float height = Float.parseFloat(in.nextLine());

        // double baseArea;
        // double surfaceArea;
        // double volume;

        // baseArea = Math.PI * radius * radius;
        // surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        // volume = baseArea * height;

        // System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        // System.out.printf("Volume is: %.2f%n", volume);
    }
}
