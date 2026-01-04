package org.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(2, 3, 4, 4, 67, 87, 89, 89, 454, 65));

        int even = 0;

        for (Integer i : numbers) {
            if (i % 2 == 0) {
                even++;
            }

        }
        System.out.println("Even numbers : " + even);

        int largest=0;
        for (Integer i:numbers){
            if(i>largest){
                largest=i;
            }

        }
        System.out.println("largest : "+largest);


        int first =0;
        int last = numbers.size()-1;

        while (first<=last){
            int temp=numbers.get(first);
            numbers.set(first,numbers.get(last));
            numbers.set(last,temp);
            first++;
            last--;
        }
        System.out.println(numbers);



    }
}
