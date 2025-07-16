package lab1.input_decision_and_loop;

import java.util.*;

public class PensionContributionCalculatorWithSentinel {
    public static void main() {
        Scanner in = new Scanner(System.in);

        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;

        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        final int SALARY_CEILING = 6000;
        final int SENTINEL = -1;

        int salary, age;
        double contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        // Read the first input to "seed" the while loop
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();

        while (salary != SENTINEL) {
            // Read the remaining
            System.out.print("Enter the age: ");
            age = in.nextInt();

            // Check the contribution cap
            if (salary > 6000) {
                contributableSalary = SALARY_CEILING;
            } else {
                contributableSalary = salary;
            }

            // Compute various contributions in "double" using a nested-if to handle 4 cases
            if (age <= 55) {

                employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * contributableSalary;
                employerContribution = EMPLOYER_RATE_55_AND_BELOW * contributableSalary;

            } else if (age <= 60) {

                employeeContribution = EMPLOYEE_RATE_55_TO_60 * contributableSalary;
                employerContribution = EMPLOYER_RATE_55_TO_60 * contributableSalary;

            } else if (age <= 65) {

                employeeContribution = EMPLOYEE_RATE_60_TO_65 * contributableSalary;
                employerContribution = EMPLOYER_RATE_60_TO_65 * contributableSalary;

            } else { // above 65

                employeeContribution = EMPLOYEE_RATE_65_ABOVE * contributableSalary;
                employerContribution = EMPLOYER_RATE_65_ABOVE * contributableSalary;
            }

            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
            System.out.printf("The total contribution is: $%.2f\n", totalContribution);

            // Read the next input and repeat
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = in.nextInt();
        }
        if (salary == SENTINEL) {
            System.out.println("bye!!");
        }
        in.close();
    }
}
