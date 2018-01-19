package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean ask2 = true;
        Boolean ask = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ''GUESS THAT NUMBER!''");

        int counterNumber = 0;

        int lostNumber = 10000;
        Random randomGuess = new Random();
        int gamesRandom = randomGuess.nextInt(lostNumber);

        while(ask2) {
            System.out.println("Please chose a number between 1-10,000 and enter it below");


            while (ask) {
                String inputNumber = sc.nextLine();

                int userNumber = Integer.parseInt(inputNumber);

                for (int i = 0; i < 1; i++) {

                    counterNumber++;

                }

                if (userNumber > gamesRandom) {
                    System.out.println("Guess " + counterNumber + ": " + userNumber + " is is high. Please enter a lower number.");

                } else if (userNumber < gamesRandom) {
                    System.out.println("Guess " + counterNumber + ": " + userNumber + " is to low. Please enter a higher number.");

                } else if (userNumber == gamesRandom) {
                    System.out.println("NUMBER MATCHES! It took you " + counterNumber + " guesses to find the correct number. Would you like to play again?");

                    if (userNumber < gamesRandom || userNumber > gamesRandom) {
                        ask = true;

                    } else {
                        ask = false;
                    }


                }
            }

            String inputAnswer = sc.nextLine();


            if (inputAnswer.equals("yes")){
                ask = true;
            } else {
                ask2 = false;
            }

        }

    }
}
