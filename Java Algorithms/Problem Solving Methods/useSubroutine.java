package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String entered = "";
        String rawWord = "";
        String[] words = null;
        int i = 0;  //for loop

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text: ");
        entered = scan.nextLine();

        words = entered.split("[ ]", -1);

        for (i=0; i<=words.length-1; i++) {
            rawWord = words[i];
            System.out.println(FirstCharacterUppercase(rawWord));
        }
    }

    public static String FirstCharacterUppercase(String word) {
        String firstCharacter = "";
        String lowercase = "";
        String newWord = "";

        firstCharacter = word.substring(0, 1);
        lowercase = word.substring(1, word.length());
        newWord = firstCharacter.toUpperCase() + lowercase.toLowerCase();

        return newWord;
    }
}