package org.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(24,6,7,8,6,8,89,4,5,6,4,5));
        ArrayList<Integer> number2 = new ArrayList<>();
        Integer temp = 0;
        for (Integer i:number){
           Boolean isDuplicate = false;
           for (Integer j:number2){
               if(i.equals(j)){
                   isDuplicate = true;
                   break;
               }

           }
           if (!isDuplicate){
               number2.add(i);
           }

        }
        System.out.println(number2);
    }
}
