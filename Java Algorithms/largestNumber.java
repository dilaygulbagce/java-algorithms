package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entered = 0;
        int largestNum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number please: ");
            entered = scan.nextInt();

            if(entered > largestNum) {
                largestNum = entered;
            }
        } while(entered != 0);

        System.out.println("The largest number is " + largestNum + ".");
    }
}