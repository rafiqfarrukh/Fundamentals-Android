package com.company.Week06;

/**
 * Created by frafiq on 2/21/2017.
 */

import java.util.Scanner;
class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }

    public static double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        Double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid Double . " + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }

    public static String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;
    }
}

public class Main {
    public static void main(String[] args){

        System.out.println(UserInput.promptInt("Enter an integer"));
        System.out.println(UserInput.promptDouble("Enter an Double"));
        System.out.println(UserInput.promptString("enter a string"));

    }
}
