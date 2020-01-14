package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        //Ask for first name
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println(firstName);

        //Ask for Last Name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println(lastName);

        //Ask for age
        System.out.println("What is your age (Give me an integer value)?");
        int age = input.nextInt();
        System.out.println(age);

        //Ask for birth month
        System.out.println("What is your birth month (Give me an integer value)?");
        int birthMonth = input.nextInt();
        System.out.println(birthMonth);

        input.nextLine();
        //Ask for favorite color
        System.out.println("What is your favorite color? (Give me a ROYGBIV color or ask for help)");
        String favoriteColor = input.nextLine();

        if (favoriteColor.equalsIgnoreCase("HELP")) {
            System.out.println("Use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, or VIOLET");
            System.out.println("What is your favorite color? (Give me a ROYGBIV color)");
            favoriteColor = input.nextLine();
        }
        System.out.println(favoriteColor);

        //Number of siblings
        System.out.println("How many siblings do you have? (Give me an integer value)?");
        int numberOfSiblings = input.nextInt();
        System.out.println(numberOfSiblings);
    }
}
