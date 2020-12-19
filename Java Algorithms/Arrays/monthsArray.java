package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] months = new String[] {"January", "February", "March", "April", "May", "June",
                                        "July", "August", "September", "October", "November", "December"};

        String entered = "";
        int monthNum = 1;
        String monthName = "January";

        Scanner scan = new Scanner(System.in);

        System.out.print("Month number please: ");
        monthNum = scan.nextInt();

        monthName = months[monthNum - 1];
        System.out.println(monthName);
    }
}