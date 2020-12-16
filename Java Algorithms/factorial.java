package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int factorial = 1;
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number please: ");
        number = scan.nextInt();

        for(i=1; i<=number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of this number is " + factorial + ".");
    }
}