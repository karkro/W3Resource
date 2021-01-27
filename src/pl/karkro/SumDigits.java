package pl.karkro;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int num = sc.nextInt();
        int sum = 0;
        int x;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
