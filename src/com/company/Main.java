package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Give your number: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        if (number<100){
            System.out.println("Your number is less than 100");

            if (number>50){
                System.out.println("Your number is higher 50");
            }

        }
    }
}
