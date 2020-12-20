package com.proje;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 4, 9, 7, 3, 1};
        int seperation = 0;
        int temporary = 0;
        int i = 0;
        int j = 0;

        seperation = array.length / 2;

        while (seperation > 0) {
            for (i=0; i<array.length-seperation;i++) {
                if (array[i] > array[i+seperation]) {
                    temporary = array[i];
                    array[i] = array[i+seperation];
                    array[i+seperation] = temporary;
                }
            }

            if (seperation == 1) {
                seperation = 0;
            }
            else {
                seperation = (int)Math.ceil(seperation/2.0);
            }
        }

        for (i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}