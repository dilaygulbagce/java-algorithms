package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius = 0.0;
        double height = 0.0;
        double cubage = 0.0;
        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the cone please: ");
        radius = scan.nextDouble();

        System.out.print("Enter the height of the cone please: ");
        height = scan.nextDouble();

        cubage = PI * Math.pow(radius, 2) / height;

        System.out.println("The Cubage of the cone is " + cubage + ".");
    }
}