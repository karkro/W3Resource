package pl.karkro;

import java.util.Scanner;

public class Combination3DigitsFromXDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of digits: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= num; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(i + "" + j + "" +k);
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Total number of the three-digit-number: " + count);
    }
}
