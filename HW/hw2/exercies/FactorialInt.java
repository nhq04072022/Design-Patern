package hw2.exercies;

public class FactorialInt {
    public static void printFactorialInt() {
        int i = 1;
        int fn = 1;

        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d \n", i, fn);
            // Check overflow
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out of range \n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }

    }

    public static void printFactorialLong() {
        long i = 1L;
        long fn = 1L;

        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d \n", i, fn);
            // Check overflow
            if (Long.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out of range \n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }
    }

    public static void main() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        System.out.println("Factorial Int:");
        printFactorialInt();
        System.out.println("Factorial Long");
        printFactorialLong();
    }
}
