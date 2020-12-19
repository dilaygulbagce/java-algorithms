package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double height = 0.0;
        double base = 0.0;
        double area = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the height of the triangle please: ");
        height = scan.nextDouble();

        System.out.print("Enter the base edge of the triangle please: ");
        base = scan.nextDouble();

        area = base * height / 2;

        System.out.println("The area of the triangle is " + area + ".");
    }
}