package org.arraydemo;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,4,7,9,4,3};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
