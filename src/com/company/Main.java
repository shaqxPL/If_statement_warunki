package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Give your number: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        if (number < 100 && number >= 1) {
            System.out.println("Your number is between 1 and 99");
        } else if (number < 1000 && number >= 100) {
            System.out.println("Your number is between 100 and 999");
        } else if (number < 10000 && number >= 1000) {
            System.out.println("Your number is between 1000 and 9999");
        } else if (number < 100000 && number >= 10000) {
            System.out.println("Your number is between 10000 and 99999");
        } else {
            System.out.println("Your number is not between 1 and 99999");
        }

    }
}