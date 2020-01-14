package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = askForFirstName();
        //Ask for Last Name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        //Ask for age
        System.out.println("What is your age (Give me an integer value)?");
        int age = input.nextInt();

        //Ask for birth month
        System.out.println("What is your birth month (Give me an integer value)?");
        int birthMonth = input.nextInt();

        input.nextLine();
        //Ask for favorite color

       String favoriteColor =askForFavoriteColor();


        //Number of siblings
        System.out.println("How many siblings do you have? (Give me an integer value)?");
        int numberOfSiblings = input.nextInt();

        //PART 2
        // Determine years until retirement.

        int numberOfYearsUntilRetirement = 0;

        if (age % 2 == 0) {
            numberOfYearsUntilRetirement = 24;
        } else {
            numberOfYearsUntilRetirement = 17;
        }

        String vacationHomeLocation = "";
        if (numberOfSiblings == 0) {
            vacationHomeLocation = "Boca Raton";
        } else if (numberOfSiblings == 1) {
            vacationHomeLocation = "Nassau";
        } else if (numberOfSiblings == 2) {
            vacationHomeLocation = "Ponta Negra";
        } else if (numberOfSiblings == 3) {
            vacationHomeLocation = "Portland";
        } else if (numberOfSiblings > 3) {
            vacationHomeLocation = "Baton Rouge";
        } else {
            vacationHomeLocation = "Chernobyl";
        }

        String modeOfTransportation = "";

        switch (favoriteColor.toUpperCase()) {
            case "RED":
                modeOfTransportation = "Maserati";
                break;
            case "ORANGE":
                modeOfTransportation = "Stallion";
                break;
            case "YELLOW":
                modeOfTransportation = "Chariot";
                break;
            case "GREEN":
                modeOfTransportation = "Taxi";
                break;
            case "BLUE":
                modeOfTransportation = "Ricksaw";
                break;
            case "INDIGO":
                modeOfTransportation = "Motor Scooter";
                break;
            case "VIOLET":
                modeOfTransportation = "Flying Saucer";
                break;
            default:
                modeOfTransportation = "Learn your colors...";
        }

        double bankBalance = 0.0;

        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 5000000.02;
        } else if (birthMonth >= 5 && birthMonth <= 8) {
            bankBalance = 250000.45;
        } else if (birthMonth >= 9 && birthMonth <= 12) {
            bankBalance = 2000000000.25;
        } else {
            bankBalance = -54000.34;
        }
        System.out.println(firstName + " " + lastName + " will retire in " + numberOfYearsUntilRetirement + " years,\n" +
                "with " + bankBalance + " in the bank, \n" +
                "a vacation home in " + vacationHomeLocation + ", \n" +
                "and travel by " + modeOfTransportation + ".");
    }

    private static String askForFirstName() {
        System.out.println("What is your first name?");
        return input.nextLine();
    }

    private static String askForFavoriteColor() {
        System.out.println("What is your favorite color? (Give me a ROYGBIV color or ask for help)");
        String favoriteColor = input.nextLine();

        if (favoriteColor.equalsIgnoreCase("HELP")) {
            System.out.println("Use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, or VIOLET");
            System.out.println("What is your favorite color? (Give me a ROYGBIV color)");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;
    }
}
