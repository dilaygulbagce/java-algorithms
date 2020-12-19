package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius = 0.0;
        double circumreference = 0.0;
        double area = 0.0;
        final double PI = 3.14;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle please: ");
        radius = scan.nextDouble();

        circumreference = radius * PI * 2;
        area = PI * Math.pow(radius, 2);

        System.out.println("The circumreference of the circle is " + circumreference + ".");
        System.out.println("The Area of the circle is " + area + ".");
    }
}