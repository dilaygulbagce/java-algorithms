package com.proje;

public class Main {

    public static void main(String[] args) {
        int temporary = 0;
        int i = 0;
        int j = 0;

        int[] array = {3, 4, 9, 7, 3, 1};

        for(i=0; i<array.length; i++) {
            for (j=0; j<array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    temporary = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporary;
                }
            }
        }

        for (i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}