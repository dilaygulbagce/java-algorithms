package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "";
        String newText = "";
        int lowerIndex = 0;
        int upperIndex = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Text please: ");
        text = scan.nextLine();

        System.out.print("Lower index: ");
        lowerIndex = scan.nextInt();

        System.out.print("Upper index: ");
        upperIndex = scan.nextInt();

        newText = text.substring(lowerIndex-1, upperIndex);

        System.out.println(newText);
    }
}