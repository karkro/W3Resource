package pl.basic1;

import java.util.Scanner;

public class MultiplicationUpTo10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
