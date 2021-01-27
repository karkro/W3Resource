package pl.basic1;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.printf("%d == %d", num1, num2);
        } else if (num1 > num2) {
            System.out.printf("%d > %d", num1, num2);
        } else {
            System.out.printf("%d < %d", num1, num2);
        }
    }
}
