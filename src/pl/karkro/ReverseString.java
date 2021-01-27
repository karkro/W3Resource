package pl.karkro;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: ");
        String str = sc.nextLine();
        char[] letters = str.toCharArray();
        System.out.print("Reversed string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
