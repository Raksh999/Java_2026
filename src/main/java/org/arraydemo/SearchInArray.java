package org.arraydemo;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,5,89,3,4,6,77,68};
        int find = 7;
        boolean flag = false;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Number Found at Index:" + i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Number NOt found");
        }


    }
}
