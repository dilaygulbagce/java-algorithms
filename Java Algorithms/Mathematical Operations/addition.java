package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double firstNum = 0.0;
        double secondNum = 0.0;
        double total = 0.0;

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter the first number please: ");
            firstNum = scan.nextDouble();

            System.out.print("Enter the second number please: ");
            secondNum = scan.nextDouble();
        }

        total = firstNum + secondNum;

        System.out.println("Total is " + total);
    }
}
