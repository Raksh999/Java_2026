package org.string;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        String str = "Hello My  Name is Raksharam";
        str = str.toUpperCase();
        int vowel =0;
        int consonant =0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'
                    || str.charAt(i)=='O' || str.charAt(i)=='U'){
                vowel++;
                System.out.println(str.charAt(i));
            }
            else
                consonant++;

        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
