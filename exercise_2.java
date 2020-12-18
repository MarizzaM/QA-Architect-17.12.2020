package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int guess, random_number;
        random_number = r.nextInt(100);
        int couunter = 0;
        do{
            System.out.println("Plesce enter number 1..100");
            guess = scanner.nextInt();
            couunter++;
            if (guess > random_number){
                System.out.println("guess lower");
            } else if (guess < random_number){
                System.out.println("guess higher");
            } else {
                System.out.println("Bingo!");
            }
        } while (guess != random_number);

        System.out.println(String.format("It took you %d guesses!", couunter))
    }
}
