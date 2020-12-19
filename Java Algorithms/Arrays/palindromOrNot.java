package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "";
        String reversedText = "";
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Text please: ");
        text = scan.nextLine();

        for (i=text.length() - 1; i>=0; i-=1) {
            reversedText = reversedText + text.substring(i, i+1);
        }

        if (text.equals(reversedText)) {
            System.out.println("PALINDROM!");
        }
        else {
            System.out.println("NOT PALINDROM!");
        }
    }
}