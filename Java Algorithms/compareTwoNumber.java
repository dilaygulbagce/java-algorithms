package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number please: ");
        number1 = scan.nextInt();

        System.out.print("Enter second number please: ");
        number2 = scan.nextInt();

        if(number1 > number2) {
            System.out.println("First number greater than second number.");
        }
        else if(number1 < number2) {
            System.out.println("Second number greater than first number.");
        }
        else {
            System.out.println("These numbers are equal.");
        }
    }
}