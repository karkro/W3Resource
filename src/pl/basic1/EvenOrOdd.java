package pl.basic1;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("The number %d is even.", num);
        } else  {
            System.out.printf("The number %d is odd.", num);
        }
    }
}
