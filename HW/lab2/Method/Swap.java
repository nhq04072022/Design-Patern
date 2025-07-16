package lab2.Method;

import java.util.Scanner;

public class Swap {
	public static void main() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter Array 1: ");
		int array1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			array1[i]=sc.nextInt();
		}

		System.out.print("Enter length 2: ");
		int n2 = sc.nextInt();
		System.out.print("Enter Array 2: ");
		int array2[] = new int[n2];
		for (int i = 0; i < n2; i++) {
			array2[i] = sc.nextInt();
		}
		sc.close();
		swap(array1,array2);
		System.out.print(swap(array1, array2));
	}
	
	public static boolean swap(int[] array1, int[] array2) {
		int temp;
		boolean swapped = false;

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; ++i) {
				temp = array1[i];
				array1[i] = array2[i];
				array2[i] = temp;
			}
			swapped = true;
		}
		return swapped;
	}
}
