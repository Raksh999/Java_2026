package org.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElements {
    public static void main(String[] args) {
        // Remove elements more than 50

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(24,6,7,8,6,8,89,4,5,6,4,5));
        Iterator<Integer> integerIterator = number.iterator();
        Iterator<Integer> it = integerIterator;
        while (it.hasNext()){
            Integer value = it.next();
            if(value>50){
                it.remove();
            }

        }
        System.out.println(number);
    }
}
