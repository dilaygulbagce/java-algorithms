package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number please: ");
        number = scan.nextInt();

        System.out.println("Factorial is " + Fact(number));
    }

    public static int Fact(int number) {
        if (number > 1) {
            return number * Fact(number - 1);
        }
        else {
            return 1;
        }
    }
}