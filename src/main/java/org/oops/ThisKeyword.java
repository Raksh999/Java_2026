package org.oops;

import javax.swing.*;
import java.util.Arrays;

public class ThisKeyword {
    String studentName;
    String schoolName;
    String[] subject;

    ThisKeyword(String studentName, String schoolName, String[] subject){
        this.studentName=studentName;
        this.schoolName=schoolName;
        this.subject=subject;
    }

    void display(){
        System.out.println("Student Name:"+studentName);
        System.out.println( "School Name:"+schoolName);
        System.out.println("subjects:"+ Arrays.toString(subject));
    }
}
