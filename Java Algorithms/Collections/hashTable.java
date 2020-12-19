package com.proje;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Hashtable characters = new java.util.Hashtable();
        String text = "";
        String character = "";
        int i = 0;  //for loop
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter text: ");
        text = scan.nextLine();

        for (i=0; i<text.length(); i++) {
            character = text.substring(i, i+1);

            if (characters.containsKey(character) == true) {
                count = (Integer)characters.get(character);
                characters.put(character, count+1);
            }
            else {
                characters.put(character, 1);
            }
        }

        Enumeration keys = characters.keys();

        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = characters.get(key);

            System.out.print(key);
            System.out.print("-");
            System.out.println(value);
        }
    }
}