package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mark = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the mark please: ");
        mark = scan.nextInt();

        if(mark >= 70 ) {
            System.out.println("Successful");
        }
        else {
            System.out.println("Unsuccessful");
        }
    }
}