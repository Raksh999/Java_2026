package org.string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        int count =0;
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
            count++;

        }
        System.out.println(count);
    }
}
