import java.io.IOException;
import java.util.Scanner;

import hw1.Debugging.Factorial;
import hw1.Nested_Loops.*;
import hw1.String_And_char_Operation.*;
import hw2.exercies.*;
import hw2.number_theory.*;
import hw2.number_theory.Gcd;
import hw2.recursion.*;
import hw2.recursion.Fibonacci;
import hw2.sort_and_search.*;
import hw3.classes.ex1.*;
import hw3.classes.ex2.TestMain;
import hw4.ex1.*;
import hw4.ex2.*;
import hw4.ex3.*;
import hw4.ex4.*;
import hw4.ex5.*;
import hw4.ex6.*;
import hw4.ex7.*;
import hw5.composition_and_inheritance.ex1.*;
import hw5.composition_and_inheritance.ex2.TestCylinder;
import lab1.decision_and_loop.*;
import lab1.exercises.*;
import lab1.input_decision_and_loop.*;
import lab2.Array.*;
import lab2.Array.GradesStatistics;
import lab2.Method.*;

public class Menu {
    private static boolean running = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (running) {
            clearScreen();
            System.out.println("----------------------------------");
            System.out.println("1.Homework1");
            System.out.println("2.Homework2");
            System.out.println("3.Homework3");
            System.out.println("4.Homework4");
            System.out.println("5.Homework5");
            System.out.println("6.Homework6");
            System.out.println("7.Lab1");
            System.out.println("8.Lab2");
            System.out.println("0.Thoat");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int n = sc.nextInt();
            clearScreen();

            switch (n) {
                case 1:
                    homework1(sc);
                    break;
                case 2:
                    homework2(sc);
                    break;
                case 3:
                    homework3(sc);
                    break;
                case 4:
                    homework4(sc);
                    break;
                case 5:
                    homework5(sc);
                    break;
                case 6:
                    homework6(sc);
                    break;
                case 7:
                    lab1(sc);
                    break;
                case 8:
                    lab2(sc);
                    break;
                case 0:
                    running = false;
            }
        }

    }

    public static void homework1(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.Debugging");
            System.out.println("2.Nested_Loops");
            System.out.println("3.String_And_char_Operation");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println(" Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.Factorial");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();
                        switch (m) {
                            case 1:
                                Factorial.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.BoxPattern");
                        System.out.println("2.CheckerPattern");
                        System.out.println("3.HillPattern");
                        System.out.println("4.SquarePattern");
                        System.out.println("5.TimeTable");
                        System.out.println("6.TriangularPattern");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon:");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();
                        switch (m) {
                            case 1:
                                BoxPattern.main();
                                break;
                            case 2:
                                CheckerPattern.main();
                                break;
                            case 3:
                                HillPattern.main();
                                break;
                            case 4:
                                SquarePattern.main();
                                break;
                            case 5:
                                TimeTable.main();
                                break;
                            case 6:
                                TriangularPattern.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }

                case 3:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.Bin2Dec");
                        System.out.println("2.CaesarsCode");
                        System.out.println("3.CheckHexStr");
                        System.out.println("4.CountVowelsDigits");
                        System.out.println("5.DecipherCaesarsCode");
                        System.out.println("6.ExchangeCipher");
                        System.out.println("7.Hex2Dec");
                        System.out.println("8.Oct2Dec");
                        System.out.println("9.PhoneKeyPad");
                        System.out.println("10.ReverseString");
                        System.out.println("11.TestPalindromicPhrase");
                        System.out.println("12.TestPalindromicWord");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println(" Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                Bin2Dec.main();
                                break;
                            case 2:
                                CaesarsCode.main();
                                break;
                            case 3:
                                CheckHexStr.main();
                                break;
                            case 4:
                                CountVowelsDigits.main();
                                break;
                            case 5:
                                DecipherCaesarsCode.main();
                                break;
                            case 6:
                                ExchangeCipher.main();
                                break;
                            case 7:
                                Hex2Dec.main();
                                break;
                            case 8:
                                Oct2Dec.main();
                                break;
                            case 9:
                                PhoneKeyPad.main();
                                break;
                            case 10:
                                ReverseString.main();
                                break;
                            case 11:
                                TestPalindromicPhrase.main();
                                break;
                            case 12:
                                TestPalindromicWord.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }
    }

    public static void homework2(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.exercies");
            System.out.println("2.number_theory");
            System.out.println("3.recursion");
            System.out.println("4.sort_and_search");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.DateUtil");
                        System.out.println("2.ExponentialSeries");
                        System.out.println("3.FactorialInt");
                        System.out.println("4.FibonacciInt");
                        System.out.println("5.Matrices");
                        System.out.println("6.NumberGuess");
                        System.out.println("7.NumberSystemConversion");
                        System.out.println("8.TrigonometricSeries");
                        System.out.println("9.WordGuess");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                DateUtil.main();
                                break;
                            case 2:
                                ExponentialSeries.main();
                                break;
                            case 3:
                                FactorialInt.main();
                                break;
                            case 4:
                                FibonacciInt.main();
                                break;
                            case 5:
                                Matrices.main();
                                break;
                            case 6:
                                NumberGuess.main();
                                break;
                            case 7:
                                NumberSystemConversion.main();
                                break;
                            case 8:
                                TrigonometricSeries.main();
                                break;
                            case 9:
                                WordGuess.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.Gcd");
                        System.out.println("2.PerfectNumberList");
                        System.out.println("3.PerfectPrimeFactorList");
                        System.out.println("4.PrimeList");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");

                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                Gcd.main();
                                break;
                            case 2:
                                PerfectNumberList.main();
                                break;
                            case 3:
                                PerfectPrimeFactorList.main();
                                break;
                            case 4:
                                PrimeList.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 3:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.Factorial");
                        System.out.println("2.Fibonacci");
                        System.out.println("3.Gcd");
                        System.out.println("4.LengthNumber");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");

                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                hw2.recursion.Factorial.main();
                                break;
                            case 2:
                                Fibonacci.main();
                                break;
                            case 3:
                                hw2.recursion.Gcd.main();
                                break;
                            case 4:
                                LengthNumber.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }

                    break;
                case 4:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.BubbleSort");
                        System.out.println("2.InsertionSort");
                        System.out.println("3.LinearSearch");
                        System.out.println("4.RecursiveBinarySearch");
                        System.out.println("5.SelectionSort");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");

                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                BubbleSort.main();
                                break;
                            case 2:
                                InsertionSort.main();
                                break;
                            case 3:
                                LinearSearch.main();
                                break;
                            case 4:
                                RecursiveBinarySearch.main();
                                break;
                            case 5:
                                SelectionSort.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }

    }

    public static void homework3(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.classes");
            System.out.println("2.composition");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ex1");
                        System.out.println("2.ex2");
                        System.out.println("3.ex3");
                        System.out.println("4.ex4");
                        System.out.println("5.ex5");
                        System.out.println("6.ex6");
                        System.out.println("7.ex7");
                        System.out.println("8.ex8");
                        System.out.println("9.ex9");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                TestCircle.main();
                                break;
                            case 2:
                                TestMain.main();
                                break;
                            case 3:
                                hw3.classes.ex3.TestMain.main();
                                break;
                            case 4:
                                hw3.classes.ex4.TestMain.main();
                                break;
                            case 5:
                                hw3.classes.ex5.TestMain.main();
                                break;
                            case 6:
                                hw3.classes.ex6.TestMain.main();
                                break;
                            case 7:
                                hw3.classes.ex7.TestMain.main();
                                break;
                            case 8:
                                hw3.classes.ex8.TestMain.main();
                                break;
                            case 9:
                                hw3.classes.ex9.TestMain.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;

                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ex1");
                        System.out.println("2.ex2");
                        System.out.println("3.ex3");
                        System.out.println("4.ex4");
                        System.out.println("5.ex5");
                        System.out.println("6.ex6");
                        System.out.println("7.ex7");
                        System.out.println("8.ex8");
                        System.out.println("9.ex9");
                        System.out.println("10.ex10");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                hw3.composition.ex1.TestBook.main();
                                break;
                            case 2:
                                hw3.composition.ex2.TestBook.main();
                                break;
                            case 3:
                                hw3.composition.ex3.TestMain.main();
                                break;
                            case 4:
                                hw3.composition.ex4.TestMain.main();
                                break;
                            case 5:
                                hw3.composition.ex5.TestMain.main();
                                break;
                            case 6:
                                hw3.composition.ex6.TestMain.main();
                                break;
                            case 7:
                                hw3.composition.ex7.TestMain.main();
                                break;
                            case 8:
                                hw3.composition.ex8.TestMain.main();
                                break;
                            case 9:
                                hw3.composition.ex9.TestMain.main();
                                break;
                            case 10:
                                hw3.composition.ex10.TestMain.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }
    }

    public static void homework4(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.ex1");
            System.out.println("2.ex2");
            System.out.println("3.ex3");
            System.out.println("4.ex4");
            System.out.println("5.ex5");
            System.out.println("6.ex6");
            System.out.println("7.ex7");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();
            switch (m) {
                case 1:
                    TestMyComplex.main();
                    break;
                case 2:
                    TestMyPolynomial.main();
                    break;
                case 3:
                    TestBigInteger.main();
                    break;
                case 4:
                    TestMyTime.main();
                    break;
                case 5:
                    TestMyDate.main();
                    break;
                case 6:
                    TestContainer.main();
                    break;
                case 7:
                    TestPlayer.main();
                    break;
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }

    }

    public static void homework5(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.composition_and_inheritance");
            System.out.println("2.inheritance");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ex1");
                        System.out.println("2.ex2");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();
                        switch (m) {
                            case 1:
                                TestLine.main();
                                break;
                            case 2:
                                TestCylinder.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ex1");
                        System.out.println("2.ex2");
                        System.out.println("3.ex3");
                        System.out.println("4.ex4");
                        System.out.println("5.ex5");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                hw5.inheritance.ex1.TestCylinder.main();
                                break;
                            case 2:
                                hw5.inheritance.ex2.TestPerson.main();
                                break;
                            case 3:
                                hw5.inheritance.ex3.TestPoint2D.main();
                                break;
                            case 4:
                                hw5.inheritance.ex4.TestShape.main();
                                break;
                            case 5:
                                hw5.inheritance.ex5.TestAnimal.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }

    }

    public static void homework6(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.ex1");
            System.out.println("2.ex2");
            System.out.println("3.ex3");
            System.out.println("4.ex4");
            System.out.println("5.ex5");
            System.out.println("6.ex6");
            System.out.println("7.ex7");
            System.out.println("8.ex8");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    hw6.ex1.TestMain.main();
                    break;
                case 2:
                    hw6.ex2.TestMain.main();
                    break;
                case 3:
                    hw6.ex3.TestMain.main();
                    break;
                case 4:
                    hw6.ex4.TestMain.main();
                    break;
                case 5:
                    hw6.ex5.TestMain.main();
                    break;
                case 6:
                    hw6.ex6.TestMain.main();
                    break;
                case 7:
                    hw6.ex7.TestMain.main();
                    break;
                case 8:
                    hw6.ex8.TestMain.main();
                    break;
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }
    }

    public static void lab1(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.decision_and_loop");
            System.out.println("2.exercises");
            System.out.println("3.input_decision_and_loop");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ComputePI");
                        System.out.println("2.ExtractDigits");
                        System.out.println("3.Fibonacci");
                        System.out.println("4.HarmonicSum");
                        System.out.println("5.SumAverageRunningInt");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                ComputePI.main();
                                break;
                            case 2:
                                ExtractDigits.main();
                                break;
                            case 3:
                                lab1.decision_and_loop.Fibonacci.main();
                                break;
                            case 4:
                                HarmonicSum.main();
                                break;
                            case 5:
                                SumAverageRunningInt.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }

                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.CheckOddEven");
                        System.out.println("2.CheckPassFail");
                        System.out.println("3.PrintDayInWord");
                        System.out.println("4.PrintNumberInWord");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                CheckOddEven.main();
                                break;
                            case 2:
                                CheckPassFail.main();
                                break;
                            case 3:
                                PrintDayInWord.main();
                                break;
                            case 4:
                                PrintNumberInWord.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                case 3:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.CircleComputation");
                        System.out.println("2.PensionContributionCalculator");
                        System.out.println("3.PensionContributionCalculatorWithSentinel");
                        System.out.println("4.ReverseInt");
                        System.out.println("5.SumProductMinMax3");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                CircleComputation.main();
                                break;
                            case 2:
                                PensionContributionCalculator.main();
                                break;
                            case 3:
                                PensionContributionCalculatorWithSentinel.main();
                                break;
                            case 4:
                                ReverseInt.main();
                                break;
                            case 5:
                                SumProductMinMax3.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }

    }

    public static void lab2(Scanner sc) {
        while (running) {
            System.out.println("----------------------------------");
            System.out.println("1.Array");
            System.out.println("2.Method");
            System.out.println("0.Thoat");
            System.out.println("-1.Quay lai");
            System.out.println("Moi ban chon: ");
            System.out.println("----------------------------------");
            int m = sc.nextInt();
            clearScreen();

            switch (m) {
                case 1:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.Dec2Hex");
                        System.out.println("2.GradesStatistics");
                        System.out.println("3.Hex2Bin");
                        System.out.println("4.PrintArray");
                        System.out.println("5.PrintArrayInStars");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();

                        switch (m) {
                            case 1:
                                Dec2Hex.main();
                                break;
                            case 2:
                                GradesStatistics.main();
                                break;
                            case 3:
                                Hex2Bin.main();
                                break;
                            case 4:
                                PrintArray.main();
                                break;
                            case 5:
                                PrintArrayInStars.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }

                case 2:
                    while (m != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("1.ArrayToString");
                        System.out.println("2.Contains");
                        System.out.println("3.CopyOf");
                        System.out.println("4.Equals");
                        System.out.println("5.Exponent");
                        System.out.println("6.GradesStatistics");
                        System.out.println("7.MagicSum");
                        System.out.println("8.Print");
                        System.out.println("9.Reverse");
                        System.out.println("10.Search");
                        System.out.println("11.Swap");
                        System.out.println("0.Thoat");
                        System.out.println("-1.Quay lai");
                        System.out.println("Moi ban chon: ");
                        System.out.println("----------------------------------");
                        m = sc.nextInt();
                        clearScreen();
                        switch (m) {
                            case 1:
                                ArrayToString.main();
                                break;
                            case 2:
                                Contains.main();
                                break;
                            case 3:
                                CopyOf.main();
                                break;
                            case 4:
                                Equals.main();
                                break;
                            case 5:
                                Exponent.main();
                                break;
                            case 6:
                                lab2.Method.GradesStatistics.main();
                                break;
                            case 7:
                                MagicSum.main();
                                break;
                            case 8:
                                Print.main();
                                break;
                            case 9:
                                Reverse.main();
                                break;
                            case 10:
                                Search.main();
                                break;
                            case 11:
                                Swap.main();
                                break;
                            case 0:
                                running = false;
                                return;
                        }
                    }
                    break;
                case 0:
                    running = false;
                case -1:
                    return;
            }
        }
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}