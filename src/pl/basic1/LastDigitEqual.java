package pl.basic1;

import java.util.Scanner;

public class LastDigitEqual {

    public static void main(String[] args) {

        System.out.println("Result true if last digit in two numbers are the same!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();
        System.out.println("The result is: " + testLastDigit(a, b, c));
    }

    public static boolean testLastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10));
    }
}
