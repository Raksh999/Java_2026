package org.oops;

public class InheritanceDemo_Employee {

    private String employeeName;
    private int employeeId;



    InheritanceDemo_Employee(String employeeName, int employeeId){
        this.employeeName=employeeName;
        this.employeeId=employeeId;


    }

    public void getCalculatedSalary(){
        System.out.println("Calculating Salary");
    }
}
