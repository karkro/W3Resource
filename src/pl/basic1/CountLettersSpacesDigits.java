package pl.basic1;

import java.util.Scanner;

public class CountLettersSpacesDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: ");
        String str = sc.nextLine();
        char[] letters = str.toCharArray();
        int letter = 0;
        int space = 0;
        int digit = 0;
        int other = 0;

        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                letter++;
            } else if (Character.isSpaceChar(letters[i])) {
                space++;
            } else if (Character.isDigit(letters[i])) {
                digit++;
            } else {
                other++;
            }
        }

        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Digits: " + digit);
        System.out.println("Others " + other);
    }
}
