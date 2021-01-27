package pl.karkro;

import java.util.Scanner;

public class SumOfTwoEqualThird {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input third number: ");
        int num3 = sc.nextInt();
        System.out.println("The result is: " + sumOfTwo(num1, num2, num3));
    }

    public static boolean sumOfTwo(int x, int y, int z) {
        return ((x + y == z) || (x + z == y) || (y + z == x));
    }
}
