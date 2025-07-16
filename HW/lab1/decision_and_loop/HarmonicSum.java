package lab1.decision_and_loop;

public class HarmonicSum {
    public static void main() {
        // Define variables
        final int MAX_DENOMINATOR = 50000; // Use a more meaningful name instead of n

        double sumL2R = 0.0; // Sum from left-to-right
        double sumR2L = 0.0; // Sum from right-to-left
        double absDiff; // Absolute difference between the two sums

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            sumL2R += 1.0 / (double) denominator;
            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        // for-loop for summing from right-to-left

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            sumR2L += 1.0 / (double) (MAX_DENOMINATOR + 1 - denominator);
            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        // Find the absolute difference and display
        if (sumL2R > sumR2L)
            absDiff = sumL2R - sumR2L;
        else
            absDiff = -(sumL2R - sumR2L);
    }
}
