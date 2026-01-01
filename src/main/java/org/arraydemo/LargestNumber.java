package org.arraydemo;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,9,5,89,3,4,6,77,68};
        int largest =0;
        int secondLargest=0;

        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] > largest) {
                secondLargest = largest;
                largest = arr1[i];
            } else if (arr1[i] > secondLargest && secondLargest < largest) {

                secondLargest = arr1[i];

            }

        }
        System.out.println(largest+ ": Largest");
        System.out.println(secondLargest +": Second largest");
    }
}
