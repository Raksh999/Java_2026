package org.oops.food_delivery_system;

public class PizzaRestaurant extends Restaurant implements Payment,Discount{

    PizzaRestaurant(String restaurant_name, int rating) {
        super(restaurant_name, rating);
    }


    @Override
    public double applyDiscount(double amount) {
        return amount*0.9;
    }

    @Override
    void prepareFood() {
        System.out.println("Food is Preparing...");
        System.out.println("Food is Ready");
    }

    @Override
    public void makePayment(int amount) {
        System.out.println("Make payment of :"+amount);
    }

    @Override
    public void makePayment(int amount, String paymentMode) {
        System.out.println("Made payment of : "+amount+  "with the "+paymentMode+" mode..");
    }
}
