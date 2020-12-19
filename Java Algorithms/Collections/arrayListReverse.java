package com.proje;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.ArrayList words = new java.util.ArrayList();
        String entered = "";
        int i = 0;  //for for loop

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a word: ");
            entered = scan.nextLine();

            if (words.contains(entered) == false) {
                words.add(entered);
            }

        } while (!entered.equals(""));

        words.remove("");
        Collections.reverse(words);

        System.out.println("Words you entered(reversed): ");

        for (i=0; i<words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}