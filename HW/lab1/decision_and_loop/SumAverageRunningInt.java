package lab1.decision_and_loop;

public class SumAverageRunningInt {
    public static void main() {
        // Define variables
        int sum = 0; // The accumulated sum, init to 0
        double average; // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number; // same as "sum = sum + number"
        }

        // TRY
        // 1.
        // int number = LOWERBOUND; // declare and init loop index variable
        // while (number <= UPPERBOUND) { // test
        // sum += number;
        // ++number; // update
        // }

        // 2.
        // int number = LOWERBOUND; // declare and init loop index variable
        // do {
        // sum += number;
        // ++number; // update
        // } while (number <= UPPERBOUND);

        // Compute average in double. Beware that int / int produces int!
        average = (double) sum / UPPERBOUND;
        // Print sum and average
        System.out.println("The sum of 1 to 100 is: " + sum);
        System.out.println("The average is: " + average);

        // 3.
        /*
         * FOR: chỉ được sử dụng khi biết số lần lặp
         * WHILE: vòng lặp vô hạn và dừng lại khi thỏa mãn đk, chỉ khi thỏa mãn đk mới
         * chạy
         * DO WHILE: làm 1 bước điều kiện trước ròi mới so sánh điều kiện
         */

        // 4.
        // int count = 0; // Count the number within the range, init to 0
        // for (int number = 111; number <= 8899; ++number) {
        // sum += number;
        // ++count;
        // }
        // average = (double)sum / (count -1);

        // System.out.println("The sum of 1 to 100 is: " + sum);
        // System.out.println("The average is: " + average);

        // 5.
        // int sum = 0;
        // int n = 100;
        // for (int i = 1; i <= n; i++)
        // sum += (i * i);
        // System.out.println("Sum quare " + sum );

        // 6.
        // int sumOdd = 0; // Accumulating sum of odd numbers
        // int sumEven = 0; // Accumulating sum of even numbers
        // int absDiff; // Absolute difference between the two sums
        // int n = 100;
        // // Compute sums
        // for (int number = 1 ;number <= n ; number++) {
        // if (number % 2 == 1) {
        // sumOdd += number;
        // } else {
        // sumEven += number;
        // }
        // }
        // // Compute Absolute Difference
        // if (sumOdd > sumEven) {
        // absDiff = sumOdd - sumEven;
        // } else {
        // absDiff = sumEven - sumOdd;
        // }
        // System.out.println("Sum Odd: " + sumOdd);
        // System.out.println("Sum Even: " + sumEven);
        // System.out.println("Absolute Difference: " + absDiff);

        //
    }
}
