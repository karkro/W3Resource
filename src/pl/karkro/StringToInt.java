package pl.karkro;

import java.util.Scanner;

public class StringToInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number(String): ");
        String str = sc.nextLine();

        int number = Integer.parseInt(str);
        System.out.print("The integer value is " + number);
    }
}
