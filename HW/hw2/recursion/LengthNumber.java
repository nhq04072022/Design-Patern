package hw2.recursion;

import java.util.Scanner;

public class LengthNumber {
    public static int countLen(String str) {

        if (str.equals(""))
            return 0;
        else
            return countLen(str.substring(1)) + 1;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String num = sc.nextLine();
        sc.close();
        System.out.println("Length Number is: " + countLen(num));
    }
}
