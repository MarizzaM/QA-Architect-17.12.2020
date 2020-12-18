package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
//        1. write for-loop which prints the numbers from 100 to 1000 in 100 steps: 100, 200, 300, .... 1000
        System.out.println("The numbers from 100 to 1000 in 100 steps:");
        for (int i = 100; i <= 1000; i += 100){
            System.out.print(i + " ");
        }
        System.out.println();

//        2. write for-loop which prints numbers from 5 to -10 (minus)
        System.out.println("The numbers from 5 to -10:");
        for (int i = 5; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println();

//        3. *etar: use for-loop to print the power of 2: 1, 2, 4, 8, 16, 32, 64, ... 2048
        System.out.println("The power of 2");
        for (int i = 1; i <= 2048; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println();

/*        4. generate a random number from 1-3
        use switch-case to print the number in hebrew.
        for exmaple if 1 was generated -> print "ehad", 2 -> print "shtaim" , 3 -> print "shalosh"
*/
        System.out.println("Generate a random number from 1-3");
        int random_number = r.nextInt(3)+1;
        switch (random_number){
            case 1:
                System.out.println("ehad");
                break;
            case 2:
                System.out.println("shtaim");
                break;
            case 3:
                System.out.println("shalosh");
                break;
        }
    }
}
