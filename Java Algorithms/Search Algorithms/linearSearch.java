package com.proje;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 9, 7, 6, 2, 4};

        int wanted = 7;
        int position = 0;
        int i = 0;

        for (i=0; i<=array.length-1; i++) {
            if (wanted == array[i]) {
                position = i;
                break;
            }
        }

        System.out.println(position+1);
    }
}