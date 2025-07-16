package hw2.exercies;

public class FibonacciInt {
    public static void printFibonacciInt() {
        int f0 = 1;
        int f1 = 1;
        int fn = 0;
        int i = 1;

        System.out.printf("F(%1$d) = %2$d\n", 0, f1);
        System.out.printf("F(%1$d) = %2$d\n", 1, f0);

        while (true) {
            i++;
            fn = f0 + f1;
            if (Integer.MAX_VALUE - f0 > f1) {
                System.out.printf("F(%1$d) = %2$d\n", i, fn);
            } else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            f1 = f0;
            f0 = fn;
        }
    }

    public static void main() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        printFibonacciInt();
    }
}
