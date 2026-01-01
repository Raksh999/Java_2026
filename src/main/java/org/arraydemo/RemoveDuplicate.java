package org.arraydemo;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,9,5,89,3,4,6,77,68};
        int[] arr2 = new int[arr1.length];
        int temp =0;
        for(int i=0; i<arr1.length; i++){
            temp = arr1[i];
            for (int j=0; j<arr2.length;j++){
                if(arr2[j]!=temp){
                    arr2[j] = temp;
                }
            }
        }
        for (int i=0; i<arr2.length; i++){
            System.out.print(" "+arr2[i]);
        }
    }
}
