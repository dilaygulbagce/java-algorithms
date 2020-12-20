package com.proje;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 3, 6, 7, 9};

        int wanted = 7;
        int position = 0;
        int topOfTheArray = 0;
        int endOfTheArray = array.length - 1;
        int middleOfTheArray = 0;

        while (topOfTheArray <= endOfTheArray) {
            middleOfTheArray = (topOfTheArray + endOfTheArray) / 2;

            if (array[middleOfTheArray] == wanted) {
                position = middleOfTheArray;
                break;
            }
            else if (array[middleOfTheArray] > wanted) {
                endOfTheArray = middleOfTheArray - 1;
            }
            else {
                topOfTheArray = middleOfTheArray + 1;
            }
        }

        System.out.println(position+1);
    }
}