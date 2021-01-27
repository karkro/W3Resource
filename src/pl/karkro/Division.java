package pl.karkro;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();
        try {
            double num3 = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.printf("%5.2f", num3);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0!");
        }
    }
}
