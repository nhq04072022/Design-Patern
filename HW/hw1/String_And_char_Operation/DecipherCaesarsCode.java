package hw1.String_And_char_Operation;

import java.util.Scanner;

public class DecipherCaesarsCode {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("The cirphertext string is: ");
        String inChar = sc.next().toUpperCase();
        sc.close();

        System.out.print("Enter a plaintext string: ");
        for (int code = 0; code < inChar.length(); code++) {
            char ch = inChar.charAt(code);

            if (ch == 'A') {
                char a = (char) ('A' - 3);
                System.out.printf("%s", a);
            } else if (ch == 'B') {
                char b = (char) ('B' - 3);
                System.out.printf("%s", b);
            } else if (ch == 'C') {
                char c = (char) ('C' - 3);
                System.out.printf("%s", c);
            } else if (ch == 'D') {
                char d = (char) ('D' - 3);
                System.out.printf("%s", d);
            } else if (ch == 'E') {
                char e = (char) ('E' - 3);
                System.out.printf("%s", e);
            } else if (ch == 'F') {
                char f = (char) ('F' - 3);
                System.out.printf("%s", f);
            } else if (ch == 'G') {
                char g = (char) ('G' - 3);
                System.out.printf("%s", g);
            } else if (ch == 'H') {
                char h = (char) ('H' - 3);
                System.out.printf("%s", h);
            } else if (ch == 'I') {
                char i = (char) ('I' - 3);
                System.out.printf("%s", i);
            } else if (ch == 'J') {
                char j = (char) ('J' - 3);
                System.out.printf("%s", j);
            } else if (ch == 'K') {
                char k = (char) ('K' - 3);
                System.out.printf("%s", k);
            } else if (ch == 'L') {
                char l = (char) ('L' - 3);
                System.out.printf("%s", l);
            } else if (ch == 'M') {
                char m = (char) ('M' - 3);
                System.out.printf("%s", m);
            } else if (ch == 'N') {
                char n = (char) ('N' - 3);
                System.out.printf("%s", n);
            } else if (ch == 'O') {
                char o = (char) ('O' - 3);
                System.out.printf("%s", o);
            } else if (ch == 'P') {
                char p = (char) ('P' - 3);
                System.out.printf("%s", p);
            } else if (ch == 'Q') {
                char q = (char) ('Q' - 3);
                System.out.printf("%s", q);
            } else if (ch == 'R') {
                char r = (char) ('R' - 3);
                System.out.printf("%s", r);
            } else if (ch == 'S') {
                char s = (char) ('S' - 3);
                System.out.printf("%s", s);
            } else if (ch == 'T') {
                char t = (char) ('T' - 3);
                System.out.printf("%s", t);
            } else if (ch == 'U') {
                char u = (char) ('U' - 3);
                System.out.printf("%s", u);
            } else if (ch == 'V') {
                char v = (char) ('V' - 3);
                System.out.printf("%s", v);
            } else if (ch == 'W') {
                char w = (char) ('W' - 3);
                System.out.printf("%s", w);
            } else if (ch == 'X') {
                char x = (char) ('X' - 23);
                System.out.printf("%s", x);
            } else if (ch == 'Y') {
                char y = (char) ('Y' - 23);
                System.out.printf("%s", y);
            } else if (ch == 'Z') {
                char z = (char) ('Z' - 23);
                System.out.printf("%s", z);
            }
        }
    }
    
}
