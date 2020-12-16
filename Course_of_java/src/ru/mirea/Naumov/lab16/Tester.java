package ru.mirea.Naumov.lab16;

public class Tester {
    public Tester(){
        RestaurantOrder restaurantOrder = new RestaurantOrder(new Dish(15, "lol", "1"));
        restaurantOrder.add(new Dish(15, "kek", "1"));
        restaurantOrder.add(new Dish(15, "qwerty", "1"));
        restaurantOrder.add(new Dish(25, "qwerty", "2"));
        restaurantOrder.add(new Dish(35, "qwerty", "3"));
        restaurantOrder.show();

        System.out.println();

        restaurantOrder.remove("qwerty");
        restaurantOrder.show();

        System.out.println();
    }

    public static void main(String[] args){
        new Tester();
    }
}
