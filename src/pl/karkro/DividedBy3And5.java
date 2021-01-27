package pl.karkro;

import java.util.Scanner;

public class DividedBy3And5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Range of the numbers: ");
        int num = sc.nextInt();

        System.out.println("Divided by 3:");
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided by 5:");
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nDivided by 3 and 5:");
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + ", ");
            }
        }

    }
}
