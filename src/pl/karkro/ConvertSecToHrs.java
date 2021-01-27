package pl.karkro;

import java.util.Scanner;

public class ConvertSecToHrs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = sc.nextInt();

        int s = sec % 60;
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        System.out.printf("The hour is: %d:%d:%d", h, m, s);
    }
}
