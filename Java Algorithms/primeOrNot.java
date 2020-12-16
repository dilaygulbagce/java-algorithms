package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int i = 0;  //for for loop
        boolean control = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number please: ");
        number = scan.nextInt();

        for(i=2; i<=number/2; i++) {
            if(number % i == 0) {
                control = false;
            }
        }

        if (control == true) {
            System.out.println("This number is prime.");
        }
        else {
            System.out.println("This number is not prime.");
        }
    }
}