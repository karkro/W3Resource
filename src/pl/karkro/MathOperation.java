package pl.karkro;

import java.util.Scanner;

public class MathOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            double num3 = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + num3);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        }
    }
}