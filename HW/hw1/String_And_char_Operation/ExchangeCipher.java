package hw1.String_And_char_Operation;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main() {
        System.out.print("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toUpperCase();
        sc.close();
        int inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
