package pl.karkro;

import java.util.Scanner;

public class InputName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String firstName = sc.next();
        System.out.print("Input your surname: ");
        String lastName = sc.next();

        System.out.println("Hello " + firstName + " " + lastName + "!");
    }
}
