package org.scanner;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("check if the age is above 18 or not");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if(age<18) {
            System.out.println("Underage" +age);
        }
        else
            System.out.println("Completly legal age."+ age);
    }
}
