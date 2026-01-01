package org.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello My Name is Raksharam";
        String newString  = "";

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);

            newString = newString+ch;
        }
        System.out.println(newString);
    }
}
