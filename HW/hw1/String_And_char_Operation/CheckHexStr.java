package hw1.String_And_char_Operation;

import java.util.Scanner;

public class CheckHexStr {
    public static void CheckHex(String input) {
        boolean isValid = true;

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {// Use positive logic → and then reverse
                isValid = false;
                break;
            }
        }
        System.out.print("Enter a hex string: ");
        if (isValid) {
            System.out.println(input + " is a hex string");
        } else {
            System.out.println(input + " is NOT a hex string");
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String input = sc.nextLine();
        sc.close();

        CheckHex(input);
    }
}
