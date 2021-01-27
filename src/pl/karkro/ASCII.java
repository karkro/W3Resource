package pl.karkro;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input char: ");
        char ch = sc.next().charAt(0);
        int x = ch;
        System.out.println("The ASCII value of " + ch + " is: " + x);
    }
}
