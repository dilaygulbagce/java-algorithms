package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lowerLimit = 0;
        int upperLimit = 0;
        int jumpCount = 0;
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit please: ");
        upperLimit = scan.nextInt();

        System.out.print("Enter lower limit please: ");
        lowerLimit = scan.nextInt();

        System.out.print("Enter jump count please: ");
        jumpCount = scan.nextInt();

        for(i=upperLimit; i>=lowerLimit; i-=jumpCount) {
            System.out.println("" + i);
        }
    }
}