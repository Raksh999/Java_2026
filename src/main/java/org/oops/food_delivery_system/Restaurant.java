package org.oops.food_delivery_system;

public abstract class Restaurant {
    private String restaurant_name;
    private int rating;

    public String getRestaurant_name() {
        return restaurant_name;
    }



    public int getRating() {
        return rating;
    }



    Restaurant(String restaurant_name, int rating){
        this.restaurant_name=restaurant_name;
        this.rating=rating;
    }
    abstract void prepareFood();
    void displayRestaurantDetails(){
        System.out.println("Restaurant Name : "+getRestaurant_name());
        System.out.println("Rating : "+getRating());
    }

}
