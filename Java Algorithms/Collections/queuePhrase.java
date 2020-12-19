package com.proje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Queue numbers = new java.util.LinkedList();
        java.util.Queue operations = new java.util.LinkedList();

        String phrase = "";
        String character = "";
        String operation = "";
        int i = 0;  //for loop
        int size = 0;
        double number1 = 0;
        double number2 = 0;
        double result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the phrase: ");
        phrase = scan.nextLine();

        for (i=0; i<phrase.length(); i++) {
            character = phrase.substring(i, i+1);

            if (i%2==0) {
                numbers.offer(Double.parseDouble(character));
            }
            else {
                operations.offer(character);
            }
        }

        number1 = (Double)numbers.poll();
        size = numbers.size();

        for (i=0; i<size; i++) {
            number2 = (Double)numbers.poll();
            operation = operations.poll().toString();

            if (operation.equals("+")) {
                result = number1 + number2;
            }
            else if (operation.equals("-")) {
                result = number1 - number2;
            }
            else if (operation.equals("/")) {
                result = number1 / number2;
            }
            else {
                result = number1 * number2;
            }

            number1 = result;
        }

        System.out.println(result);
    }
}