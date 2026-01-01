package org.string;

public class ToUpperCase {
    public static void main(String[] args) {
        String str = "Hello My name is Raksharam.";
        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >='a' && ch<='z'){
                ch = (char) (ch-32);

            }
            result = result+ch;

        }
        System.out.println(result);
    }
}
