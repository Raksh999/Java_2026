package org.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
//        String  newString = "";
//        for(int i=str.length()-1; i>=0; i--){
//            char c = str.charAt(i);
//            System.out.println(c);
//            newString = newString+c;
//
//        }
//        System.out.println(str.equals(newString));
//    }


        int i=0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palidrome");
                break;
            }
            i++;
            j--;
        }
        System.out.println("is Palindorme");
    }
}
