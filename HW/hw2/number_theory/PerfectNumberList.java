package hw2.number_theory;

import java.util.*;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0)
                sum += i;
        }
        return (sum == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0)
                sum += i;
        }
        return (sum < aPosInt);
    }

    public static void main() {
        List<Integer> perfect = new ArrayList<Integer>();
        List<Integer> neither = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        sc.close();

        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i))
                perfect.add(i);
            else if (!isDeficient(i))
                neither.add(i);
        }

        System.out.println("These numbers are perfect: ");
        for (int p : perfect)
            System.out.print(p + " ");
        System.out.println("\n[" + perfect.size() + " perfect numbers found ("
                + (((double) perfect.size() / (double) upperBound) * 100) + "%)]");

        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int n : neither)
            System.out.print(n + " ");
        System.out.println("\n[" + neither.size() + " numbers found ("
                + (((double) neither.size() / (double) upperBound) * 100) + "%)]");

    }
}
