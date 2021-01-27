package pl.basic1;

import java.util.Scanner;

public class SumXNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to sum: ");
        int count = sc.nextInt();
        int sum = 0;
        int num;
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of " + count + " numbers: " + sum);
    }
}