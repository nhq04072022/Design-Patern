package lab1.decision_and_loop;

public class Fibonacci {
    public static void main() {
        int n = 3; // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn; // F(n) to be computed
        int fnMinus1 = 1; // F(n-1), init to F(2)
        int fnMinus2 = 1; // F(n-2), init to F(1)
        int nMax = 20; // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2; // Need sum to compute average
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus1 + " ");
        System.out.print(fnMinus2 + " ");

        while (n <= nMax) { // n starts from 3
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");// n = 3, 4, 5, ..., nMax
            // Compute F(n), print it and add to sum
            sum += fn;

            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        // Compute and display the average (=sum/nMax).
        average = (double) sum / (double) nMax;
        // Beware that int/int gives int.
        System.out.println("The average is " + average);

        // TRY 1.
        // int n = 3;
        // int tn;
        // int tnMinus1 = 1;
        // int tnMinus2 = 1;
        // int tnMinus3 = 1;
        // int nMax2 = 20;
        // int sum2 = tnMinus1 + tnMinus2 + tnMinus3;
        // double average2;

        // System.out.print("The first " + nMax2 + " Fibonacci numbers are:");
        // System.out.print(tnMinus1 + " ");
        // System.out.print(tnMinus2 + " ");
        // System.out.println(tnMinus3 + " ");
        // // T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2.

        // while (n <= nMax2) {
        // tn = tnMinus1 + tnMinus2 + tnMinus3;
        // System.out.print(tn + " ");
        // sum2 += tn;
        // ++n;

        // tnMinus3 = tnMinus2;
        // tnMinus2 = tnMinus1;
        // tnMinus1 = tn;
        // }
        // average2 = (double) sum2 / (double) nMax2; // Compute and display the average
        // (=sum/nMax).
        // System.out.println();
        // System.out.println("The average is " + average2);
        //
    }

}
