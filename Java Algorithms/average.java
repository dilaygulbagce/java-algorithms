package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double entered = 0;
        int count = 0;
        double total = 0;
        double average = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number please: ");
            entered = scan.nextDouble();

            total += entered;
            count++;

        } while(entered != 0);

        average = total / (count-1);
        
        System.out.println("The average of these numbers is " + average + ".");
    }
}