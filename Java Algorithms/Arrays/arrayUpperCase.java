package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "";
        String newText = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Text please: ");
        text = scan.nextLine();
        newText = text.toUpperCase();

        System.out.println("Here your upper case text: " + newText);
    }
}