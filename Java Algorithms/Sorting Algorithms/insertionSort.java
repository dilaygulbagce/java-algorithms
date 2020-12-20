package com.proje;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 4, 9, 7, 3, 1};
        int temporary = 0;
        int i = 0;
        int j = 0;

        for (i=1; i<=array.length-1;i++) {
            j = i - 1;
            temporary = array[i];

            while (j>=0 && temporary<array[j]) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = temporary;
        }

        for (i=0; i<=array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
}