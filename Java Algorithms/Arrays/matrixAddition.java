package com.proje;

public class Main {

    public static void main(String[] args) {
        int[][] firstMatrix = new int[][] {{2,3,4},{5,4,3}};
        int[][] secondMatrix = new int[][] {{6,2,7}, {5,4,7}};
        int[][] totalMatrix = new int[2][3];

        int line = 0;
        int column = 0;

        for (line=0; line<2; line++) {
            for (column=0; column<3; column++) {
                totalMatrix[line][column] = firstMatrix[line][column] + secondMatrix[line][column];
            }
        }

        System.out.println("Total matrix is: ");

        for (line=0; line<2; line++) {
            for (column=0; column<3; column++) {
                System.out.print(" " + totalMatrix[line][column]);
            }
            System.out.println();
        }
    }
}