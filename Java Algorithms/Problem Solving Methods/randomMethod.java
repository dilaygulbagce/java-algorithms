package com.proje;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        java.util.Random random = new Random();
        int die1 = 0;
        int die2 = 0;

        die1 = random.nextInt(5) + 1;
        die2 = random.nextInt(5) + 1;

        System.out.println(die1 + "-" + die2);
    }
}