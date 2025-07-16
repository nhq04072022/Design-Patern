package hw2.exercies;

public class TrigonometricSeries {
    // x in radians, NOT degrees
    public static double sin(double x, int numTerms) {
        double sin = x;
        int denom = 3;

        for (int i = 2; i <= numTerms; i++) {
            if (i % 2 == 0)
                sin -= term(x, denom);
            else
                sin += term(x, denom);
            denom += 2;
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double cos = 1;
        int denom = 2;

        for (int i = 2; i <= numTerms; i++) {
            if (i % 2 == 0)
                cos -= term(x, denom);
            else
                cos += term(x, denom);
            denom += 2;
        }
        return cos;
    }

    // Lưu số hạng ở bước thứ i
    public static double term(double x, int numTerms) {
        double term = 1;
        for (int i = numTerms; i >= 1; i--) {
            term *= x / i;
        }
        return term;
    }

    public static void main() {
        double[] nums = { 0, 4, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2 };

        for (double n : nums) {
            System.out.println("Calculated sin: " + sin(n, 10));
            System.out.println("Math.sin: " + Math.sin(n));
            System.out.println("Calculated cos: " + cos(n, 10));
            System.out.println("Math.cos: " + Math.cos(n));
            System.out.println();
        }
    }
}
