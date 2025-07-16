package hw1.String_And_char_Operation;

import java.util.Scanner;

public class ReverseString {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();

        System.out.print("Enter a number start reverse string: ");
        int inStrLen = Integer.parseInt(sc.nextLine());
        sc.close();

        // Use inStr.charAt(index) in a loop to extract each character
        // The String's index begins at 0 from the left
        // Process the String from the right
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
