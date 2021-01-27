package pl.karkro;

import java.util.Scanner;

public class CapitalizeFirstLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
        }
    }
}
