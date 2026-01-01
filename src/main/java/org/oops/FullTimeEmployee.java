package org.oops;

public class FullTimeEmployee extends InheritanceDemo_Employee{
    private int monthlySalary;

    FullTimeEmployee(String employeeName, int employeeId, int monthlySalary) {
        super(employeeName, employeeId);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public void getCalculatedSalary() {
        System.out.println("Monthly Salary :"+monthlySalary);
    }
}
