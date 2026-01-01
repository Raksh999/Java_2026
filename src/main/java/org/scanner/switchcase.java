package org.scanner;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2.Substaction");
        System.out.println("3.multiply");
        System.out.println("4.Divide");

        System.out.println("Choose you Option");
        int option = scanner.nextInt();
        int a=10;
        int b=20;

        switch (option){
            case 1:
                System.out.println("Addition: " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiply: "+(a*b));
                break;
            case 4:
                System.out.println("Divide: "+(a/b));
                break;
            default:
                System.out.println("InValid Option");

        }
    }
}
