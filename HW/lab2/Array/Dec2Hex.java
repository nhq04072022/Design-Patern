package lab2.Array;

import java.util.Scanner;

//thap phan(0->15) sang thap luc phan(0->9 & A-F)
public class Dec2Hex {
    public static void dec2Hex(int n){
        char chHex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hex = "";
        int temp = 0;

        while(n != 0){
            temp = n % 16;
            hex = chHex[temp] + hex;
            n = n / 16; 
        }
        System.out.println("The equivalent hexadecimal number is " + hex );
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        dec2Hex(n);
        sc.close();
    }
}
