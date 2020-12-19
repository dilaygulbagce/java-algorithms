package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int howManyRepeat = 0;
        int i = 0; //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number please: ");
        number = scan.nextInt();

        System.out.print("Enter how many repeat please: ");
        howManyRepeat = scan.nextInt();

        for(i=1; i<=howManyRepeat; i++) {
            System.out.println("" + number);
        }
    }
}