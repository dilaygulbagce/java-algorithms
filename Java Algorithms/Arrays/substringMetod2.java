package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "";
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        System.out.print("Text please: ");
        text = scan.nextLine();

        for (i=0; i<text.length(); i++) {
            System.out.println(text.substring(0, i+1));
        }
    }
}