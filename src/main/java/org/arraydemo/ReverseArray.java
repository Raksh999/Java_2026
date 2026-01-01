package org.arraydemo;

//this Program is to Reverse the array without using the new array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,5,89,3,4,6,77,68};
        int temp=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length/2; i++) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
