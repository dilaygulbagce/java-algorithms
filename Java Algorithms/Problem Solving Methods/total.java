package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String entered = "";
        int number = 0;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            entered = scan.nextLine();

            if (entered.equals("")) {
                break;
            }
            number = Integer.parseInt(entered);

            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                total -= number;
            }
            else {
                total += number;
            }
            if (total >= 100) {
                break;
            }
        } while (true);

        System.out.println("Total: " + total);
    }
}