package ru.mirea.Naumov.lab16;

public class OrderManager {
    private RestaurantOrder[] restaurantOrders = new RestaurantOrder[100];

    public OrderManager(){
        for (int i = 0; i < 100; i++){
            restaurantOrders[i] = null;
        }
    }

    public void add(RestaurantOrder restaurantOrder, int TableNumber){
        restaurantOrder.TableNumber = TableNumber;

        for (int i = 0; i < 100; i++){
            if (restaurantOrders[i] == null){
                restaurantOrders[i] = restaurantOrder;
                return;
            }
        }
    }

    public RestaurantOrder getOrder (int TableNumber){
        for (int i = 0; i < 100; i++){
            if(restaurantOrders[i].TableNumber == TableNumber){
                return restaurantOrders[i];
            }
        }
        return null;
    }

    public void addDish(Dish dish, int TableNumber){
        RestaurantOrder temp = new RestaurantOrder(dish);
        temp.TableNumber = TableNumber;

        for (int i = 0; i < 100; i++){
            if (restaurantOrders[i] == null){
                restaurantOrders[i] = temp;
                return;
            }
        }
    }

    public void removeOrder(int TableNumber){
        for (int i = 0; i < 100; i++){
            if (TableNumber == restaurantOrders[i].TableNumber){
                restaurantOrders[i] = null;
            }
        }
    }

    public int freeTableNumber(){
        int []temp = new int[100];
        for (int i = 0 ; i < 100; i++){
            temp[i] = 0;
        }

        for (int i = 0; i < 100; i++){
            if (restaurantOrders[i] != null){
                temp[restaurantOrders[i].TableNumber - 1] = 1;
            }
        }

        for (int i = 0; i < 100; i++){
            if (temp[i] == 0){
                return i+1;
            }
        }

        return -1;
    }

    public RestaurantOrder[] getOrders(){
        return restaurantOrders;
    }

    public double ordersCostSummary(){
        double sum = 0;

        for (int i = 0; i < 100; i++){
            if (restaurantOrders[i] != null){
                sum += restaurantOrders[i].costTotal();
            }
        }

        return sum;
    }
}
