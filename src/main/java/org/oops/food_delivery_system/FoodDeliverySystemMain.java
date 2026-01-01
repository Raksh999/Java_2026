package org.oops.food_delivery_system;

public class FoodDeliverySystemMain {
    public static void main(String[] args) {

        Restaurant restaurant = new PizzaRestaurant("Pizzeria",5);
        restaurant.displayRestaurantDetails();
        restaurant.prepareFood();

        Payment payment = (Payment) restaurant;
        payment.makePayment(2000,"Cash");

    }
}
