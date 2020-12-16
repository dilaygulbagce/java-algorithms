package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number please: ");
        number = scan.nextInt();

        if(number % 2 == 0) {
            System.out.println("This number is even.");
        }
        else {
            System.out.println("This number is uneven.");
        }
    }
}