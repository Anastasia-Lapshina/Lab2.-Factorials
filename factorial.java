package com.company;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 15: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 15 && number >= 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;
                }
            System.out.println("Factorial of " + number + " is equal to: " + factorial);
            }
            else {
                System.out.println("Invalid data. Enter an integer in range [0;15]");
            }
        }
        else {
            System.out.println("Invalid data. Enter a positive integer less than 15");
        }
    }
}