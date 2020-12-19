package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double shortEdge = 0.0;
        double longEdge = 0.0;
        double rectangleArea = 0.0;
        double rectangleCircumference = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the short edge of rectangle please: ");
        shortEdge = scan.nextDouble();

        System.out.print("Enter the long edge of rectangle please: ");
        longEdge = scan.nextDouble();

        rectangleArea = shortEdge * longEdge;
        rectangleCircumference = (shortEdge + longEdge) * 2;

        System.out.println("Area of the rectangle is " + rectangleArea + ".");
        System.out.println("Circumference of the rectangle is " + rectangleCircumference + ".");
    }
}