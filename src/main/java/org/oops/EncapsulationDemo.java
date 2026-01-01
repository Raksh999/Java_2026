package org.oops;

public class EncapsulationDemo {
    private int balance= 10000;
    private int amount;


    public int getBalance(){
        return balance;
    }

    public void depositAmount(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited : "+amount);
        }
        else {
            System.out.println("Invalid Deposit");
        }

    }
    public void withdrawAmount(int amount){
        if(balance>=0 && amount<balance){
            balance-=amount;
            System.out.println("Amount withdrawn : "+ amount);
        }
        else {
            System.out.println("Invalid withdrawal");
        }

    }

}
