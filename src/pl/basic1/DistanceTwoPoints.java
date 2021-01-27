package pl.basic1;

import java.util.Scanner;

public class DistanceTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = sc.nextDouble();

        System.out.println("Distance: " + distanceBetweenPoints(x1, y1, x2, y2) + "km");
    }

    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double radiusEarth = 6371.01;
        double distance = radiusEarth * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(y1) * Math.cos(y2) * Math.cos(y1 - y2));
        return distance;
    }
}
