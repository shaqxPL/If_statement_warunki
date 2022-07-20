package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Give your number: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        if (number > 0) {
            System.out.println("Your number is positive");
        }
        else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is 0");
        }

    }
}