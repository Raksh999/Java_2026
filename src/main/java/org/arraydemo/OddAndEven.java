package org.arraydemo;

public class OddAndEven {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,5,89,3,4,6,77,68};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){

                System.out.println("Number is EVEN: " +arr[i]);
            }
            else
                System.out.println("Number is ODD: "+arr[i]);
        }
    }
}
