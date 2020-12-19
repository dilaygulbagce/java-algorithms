package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fibonacciLength = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        int newNumber = 0;
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the fibonacci length please: ");
        fibonacciLength = scan.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for(i=3; i<=fibonacciLength; i++) {
            newNumber = firstNumber + secondNumber;
            System.out.println(newNumber);
            firstNumber = secondNumber;
            secondNumber = newNumber;
        }
    }
}