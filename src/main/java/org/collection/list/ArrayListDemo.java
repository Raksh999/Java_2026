package org.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(2,3,5,8,9,7));
        for( Integer i:number){
            System.out.println(i);
        }

        ArrayList<String> city =
                new ArrayList<>(Arrays.asList("Pune","Bengaluru","mumbai","delhi","chennai","Kolkata"));

        System.out.println(city.size());
        System.out.println("First Index : "+city.get(0)+" Last City : "+city.get(5));

        // Replacing the city  name of index 2
        city.add(2,"Lucknow");
        System.out.println(city);

        boolean flag =false;

        for (String i:city){
            if (i.equals("Pune")) {
                flag = true;
                break;

            }

        }

        if(flag==true){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

        if (city.contains("mumbai")){
            System.out.println("Found ");

        }
        else{
            System.out.println("Not Found");
        }


    }

}
