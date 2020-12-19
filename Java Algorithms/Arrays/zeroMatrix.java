package com.proje;

public class Main {

    public static void main(String[] args) {
        int[][] zeroMatrix = new int[4][5];
        int line = 0;
        int column = 0;

        for (line=0; line<4; line++) {
            for (column=0; column<5; column++) {
                zeroMatrix[line][column] = 0;
            }
        }

        for (line=0; line<4; line++) {
            for (column=0; column<5; column++) {
                System.out.print(zeroMatrix[line][column]);
            }
            System.out.println();
        }
    }
}