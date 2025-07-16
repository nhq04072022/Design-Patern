package hw1.String_And_char_Operation;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String inStr = sc.next().toLowerCase();
        sc.close();
        int vowels = 0;
        int digits = 0;

        //count vowels and digits
        for (int i = 0; i < inStr.length(); i++) {
            char a = inStr.charAt(i);

            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') vowels++;
            if(Character.isDigit(a)) digits++;    
        }
        //Tinh %
        double vowelsPrecent = (((double) vowels / (double) inStr.length()) * 100);
        double digitsPrecent = (((double) digits / (double) inStr.length()) * 100);

        System.out.printf("Number of vowels: %d (%.2f %%) \n", vowels, vowelsPrecent);
        System.out.printf("Number of digits: %d (%.2f %%) \n", digits, digitsPrecent);
    }
}
