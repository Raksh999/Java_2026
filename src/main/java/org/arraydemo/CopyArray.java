package org.arraydemo;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,9,5,89,3,4,6,77,68};
        int[] arr2 = new int[arr1.length];
        for (int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];

        }
        for (int i=0; i<arr2.length; i++){
            System.out.print(" "+arr2[i]);
        }

    }
}
