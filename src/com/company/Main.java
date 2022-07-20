package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = userInput.nextInt();
        if(number<100){
            System.out.println("Your number is less than 100");
        }

    }
}
