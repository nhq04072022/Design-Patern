package hw1.String_And_char_Operation;

import java.util.Scanner;
import java.lang.Math;

public class Oct2Dec {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Octal String: ");
        int oct = sc.nextInt();

        int i = 0;
        double decimal = 0;

        while (oct > 0) {
            decimal = decimal + (oct % 10) * Math.pow(8, i);
            i++;
            oct /= 10;
        }
        System.out.print("The equival ent decimal number " + oct + " is: " + decimal);
        sc.close();
    }
}
