package pl.basic1;

import java.util.Scanner;

public class HowManyDivisors {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number: ");
            int num = sc.nextInt();

            int[] factors = new int[num];
            int j = 0;
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors[j] = i;
                    j++;
                    count++;
                }
            }
            System.out.printf("The number %d has %d factors.", num, count);
            System.out.print("\nThe factors: ");
            for (int factor : factors) {
                if (factor > 0) {
                    System.out.print(factor + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("The number you entered is not an int");
        }

    }
}
