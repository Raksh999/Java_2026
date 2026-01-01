package org.oops.food_delivery_system;

public interface Payment {
    public void makePayment(int amount);
    public void makePayment(int amount,String paymentMode);
}
