package org.scanner;

import java.util.Scanner;

public class double_array {
    public static void main(String[] args) {
        System.out.println("Enter a 2 dimentional array");
        int[][] arr = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}