package com.proje;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        java.util.ArrayList paticipants = new java.util.ArrayList();
        java.util.Random random = new java.util.Random();
        String[] winners = new String[3];
        int index = 0;
        int i = 0;  // for loop

        paticipants.add("Jack");
        paticipants.add("Amelie");
        paticipants.add("Anna");
        paticipants.add("John");
        paticipants.add("Robert");
        paticipants.add("Emily");
        paticipants.add("Matt");
        paticipants.add("Stefan");
        paticipants.add("Brandon");
        paticipants.add("Amy");

        for (i=0; i<3; i++) {
            index = random.nextInt(paticipants.size() - 1);
            winners[i] = paticipants.get(index).toString();
            paticipants.remove(index);
        }

        for (i=0; i<3; i++) {
            System.out.println(i+1 + ". winner: " + winners[i]);
        }
    }
}