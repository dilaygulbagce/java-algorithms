package com.proje;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 4, 9, 7, 3, 1};
        int smallestPosition = 0;
        int temporary = 0;
        int i = 0;
        int j = 0;

        for (i=0; i<=array.length-1; i++) {
            smallestPosition = i;

            for (j=i+1; j<=array.length-1; j++) {
                if (array[j] < array[smallestPosition]) {
                    smallestPosition = j;
                }
            }

            temporary = array[i];
            array[i] = array[smallestPosition];
            array[smallestPosition] = temporary;
        }

        for (i=0; i<=array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
}