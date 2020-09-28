package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 1000");
        int userInput = scanner.nextInt();

        if (userInput > 1000) {
            System.out.println("Введи число меньше");
            return;
        } else if (userInput < 1) {
            System.out.println("Введи число больше ");
            return;
        }

        for (int i = 0; i <= userInput; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
