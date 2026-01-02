package org.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
//checked Exception Compiler forces us to handle the Exception
public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
