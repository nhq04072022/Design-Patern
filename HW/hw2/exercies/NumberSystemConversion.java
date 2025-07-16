package hw2.exercies;

import java.util.Scanner;

public class NumberSystemConversion {
    private final static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static int toDecimal(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        String result = "";
        if (radix == 0)
            return result;

        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    // The input and output are treated as String .
    // radix: Quyết định chuỗi sẽ được chuyển sang cơ số nào.
    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toDecimal(in, inRadix), outRadix);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        sc.close();

        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n",
                number, inRadix, toRadix(number, inRadix, outRadix), outRadix);
    }

}
