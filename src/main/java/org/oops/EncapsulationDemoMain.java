package org.oops;

public class EncapsulationDemoMain {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();

        System.out.println("The Current Balance is :"+encapsulationDemo.getBalance());

        encapsulationDemo.depositAmount(3000);
        System.out.println("The Current Balance is :"+encapsulationDemo.getBalance());

        encapsulationDemo.withdrawAmount(8000);
        System.out.println("The Current Balance is :"+encapsulationDemo.getBalance());

        encapsulationDemo.withdrawAmount(9000);
        System.out.println("The Current Balance is :"+encapsulationDemo.getBalance());

    }
}
