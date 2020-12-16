package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double firstNum = 0.0;
        double secondNum = 0.0;
        double result = 0;

        String entered = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number please: ");
        entered = scan.nextLine();
        firstNum = Double.parseDouble(entered);

        System.out.print("Enter the second number please: ");
        entered = scan.nextLine();
        secondNum = Double.parseDouble(entered);

        result = firstNum / secondNum;

        System.out.println("Result is " + result);
    }
}