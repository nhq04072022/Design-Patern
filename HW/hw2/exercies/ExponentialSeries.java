package hw2.exercies;

import java.util.Scanner;

public class ExponentialSeries {
    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        int numerator = 1;
        int denominator = 2;
        int numer_inc = 1;
        int denom_inc = 2;

        if (x < -1 || x > 1) {
            System.out.println("x not in range [-1;1]");
            return 0;
        }

        for (int i = 2; i <= numTerms; i++) {
            if (i % 2 == 0) {
                sum += (numerator / denominator);
                numer_inc += 2;
                denom_inc += 2;
                numerator *= numer_inc;
                denominator *= denom_inc;
            } else {
                sum *= Math.pow(x, i) / i;
            }
        }
        return sum;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Double x: ");
        double x = sc.nextDouble();
        System.out.print("Enter numberTerms: ");
        int numTerms = sc.nextInt();
        sc.close();

        System.out.println("Exponential Series: " + specialSeries(x, numTerms));
    }
}
