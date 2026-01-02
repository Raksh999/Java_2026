package org.exception_handling;

import java.util.Scanner;

//unchecked Exception compiler does not force us to use the exception handling
public class UncheckedException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();


        if(a>0){
            int number = 10/a;
            System.out.println(number);
        }
        else throw new ArithmeticException("Cannot Divide by 0");
        

    }
}
