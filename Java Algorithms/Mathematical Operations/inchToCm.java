package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double iLength = 0.0;
        double cmLength = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length(inch) please: ");
        iLength = scan.nextDouble();

        cmLength = iLength * 2.54;

        System.out.println("The length(cm) is " + cmLength + ".");
    }
}