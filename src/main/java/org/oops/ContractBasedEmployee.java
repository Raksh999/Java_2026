package org.oops;

public class ContractBasedEmployee extends InheritanceDemo_Employee{
    private int monthlySalary;
    private int hours;
    private int perHourWage;

    ContractBasedEmployee(String employeeName, int employeeId, int hours, int perHourWage) {
        super(employeeName, employeeId);

        this.hours=hours;
        this.perHourWage=perHourWage;

    }

    @Override
    public void getCalculatedSalary() {
        monthlySalary = hours*perHourWage;
        System.out.println("Monthly Salary :"+monthlySalary);
    }
}
