package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[11];

        String entered = "";
        int number = 0;
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 number please: ");

        for (i=0; i<10; i++) {
            number = scan.nextInt();
            numbers[i] = number;
        }

        System.out.println();
        System.out.println("Even numbers: ");

        for (i=0; i<10; i++) {
            if (numbers[i]%2==0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println();
        System.out.println("Uneven numbers: ");

        for (i=0; i<10; i++) {
            if (numbers[i]%2==1) {
                System.out.println(numbers[i]);
            }
        }
    }
}