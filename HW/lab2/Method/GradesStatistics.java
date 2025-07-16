package lab2.Method;

import java.util.*;

public class GradesStatistics {
	public static int[] grades;

	public static void main() {
		readGrades();
		print(grades);
		System.out.printf("\n%s%.2f", "The average is: ", average(grades));
		System.out.printf("\n%s%.2f", "The median is: ", median(grades));
		System.out.printf("\n%s%d", "The minimum is: ", min(grades));
		System.out.printf("\n%s%d", "The maximum is: ", max(grades));
		System.out.printf("\n%s%.2f", "The standard deviation is: ", stdDev(grades));

	}

	public static void readGrades() {
		int students;
		int placeholder;
		boolean isValid;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students: ");
		students = sc.nextInt();
		sc.close();
		grades = new int[students];

		for (int i = 0; i <= grades.length - 1; ++i) {
			isValid = false; // set to false
			do { // use placeholder to validate input
				System.out.print("Enter the grade for student " + ( i + 1 ) + ":" );
				placeholder = sc.nextInt();
				if (placeholder >= 0 && placeholder <= 100) {
					isValid = true;
				} else {
					System.out.println("Enter a valid digit between 0-100");
				}
			} while (!isValid); // when input is valid THEN add it to the Array
			grades[i] = placeholder;
		}
	}

	public static void print(int[] array) { 
		System.out.print("The grades are: [");
		for (int i = 0; i <= array.length - 1; ++i) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print("]");
	}

	public static double average(int[] array) {
		double sum = 0;

		for (int i = 0; i <= array.length - 1; ++i) {
			sum += array[i];
		}
		sum = sum / array.length;
		return sum;
	}

	public static double median(int[] array) {
		double median = 0;
		int middle = array.length / 2;
		int valueBase;
		int j;

		for (int i = 0; i <= array.length - 1; ++i) {
			valueBase = array[i];
			for (j = i; j > 0 && array[j - 1] > valueBase; j--) {
				array[j] = array[j - 1];
			}
			array[j] = valueBase;
		}
		for (int i = 0; i <= array.length - 1; ++i) {
			if (array.length % 2 != 0) {
				median = array[middle];
			} else {
				median = (array[middle] + array[middle - 1]) / 2;
			}
		}
		return median;
	}

	public static int max(int[] array) {
		int max = array[0];

		for (int i = 0; i <= array.length - 1; ++i) {
			while (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];

		for (int i = 0; i <= array.length - 1; ++i) {
			while (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static double stdDev(int[] array) {
		if (grades.length == 0) {
			return 0f;
		}
		double avg = average(grades);
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i] * grades[i] - avg * avg;
		}
		return Math.sqrt(sum / grades.length);
	}
}