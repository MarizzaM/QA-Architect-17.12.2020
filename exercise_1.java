package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = -10; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 7; i <= 105; i +=7){
            System.out.print(i + " ");
        }
        System.out.println("");

        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        
        System.out.print("Enter jump ");
        int jump = scanner.nextInt();
        System.out.print("Enter max ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i += jump){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("Enter number ");
        int number = scanner.nextInt();
        for (int j=1; j <= number; j++){
           if (number%j == 0){
               System.out.print(number/j + " ");
           }
        }
    }
}
