package org.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayListDemo {
    public static void main(String[] args) {


        //creation
        String[] arraySubject = {"English","Maths","Science","History","Geography"};

        ArrayList<String> arrayListSubject =
                new ArrayList<>(Arrays.asList("English","Maths","Science","History","Geography"));

        //Get a element
        System.out.println(arraySubject[2]);
        System.out.println(arrayListSubject.get(3));

        //Get size
        System.out.println(arraySubject.length);
        System.out.println(arrayListSubject.size());

        // add a element
        // You can't add  element in array
        //You can add a element in ArrayList
        arrayListSubject.add("Physics");
        System.out.println(arrayListSubject.get(5));

        //Remove a element
        // You cant remove a element from an array as its fixed in size

        // printing
        System.out.println(arraySubject); // it gives the memory address of the object
        System.out.println(arrayListSubject);

    }
}
