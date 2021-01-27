package pl.karkro;

import java.io.Console;
import java.util.Scanner;

public class ShowPassword {

    public static void main(String[] args) {

        Console cons = System.console();
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your password");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password...No console");
        }
        Scanner sc = new Scanner(System.in);
    }
}
