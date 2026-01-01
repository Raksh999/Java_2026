package org.oops;

public class EmployeeMain {
    public static void main(String[] args) {
       InheritanceDemo_Employee employee1
               = new FullTimeEmployee("Raksh",101, 100002);

       InheritanceDemo_Employee employee2=
               new ContractBasedEmployee("Raksh",102, 3,2000);

       employee1.getCalculatedSalary();
       employee2.getCalculatedSalary();
    }
}
