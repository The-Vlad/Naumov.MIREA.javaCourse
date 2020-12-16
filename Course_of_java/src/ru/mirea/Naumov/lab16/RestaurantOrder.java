package ru.mirea.Naumov.lab16;

public class RestaurantOrder implements IOrder{
    private RestaurantOrder queue = null;
    private RestaurantOrder next = null;
    private RestaurantOrder prev = null;
    private Dish dish;
    private int curSize;
    public int TableNumber;

    public RestaurantOrder(Dish dish){
        this.dish = dish;
    }

    public boolean add (Item dish){
        RestaurantOrder insertion = new RestaurantOrder((Dish)dish);
        boolean success = false;

        if(queue == null){
            queue = insertion;
            success = true;
        }

        else
        {
            RestaurantOrder lastElem = queue;
            while(lastElem.next != null){
                lastElem = lastElem.next;
            }
            lastElem.next = insertion;
            insertion.prev = lastElem;
            success = true;
        }

        curSize++;

        return success;
    }

    public boolean remove(String dishName){
        RestaurantOrder temp = queue;
        boolean success = false;

        while(temp.next != null){
            if (temp.dish.getName() == dishName){
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;

                temp = null;

                curSize--;
                success = true;
                break;
            }

            temp = temp.next;
        }

        return success;
    }

    public boolean removeAll(String dishName){
        RestaurantOrder temp = queue;
        boolean success = false;

        while(temp.next != null){
            if (temp.dish.getName() == dishName){
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;

                temp = null;

                curSize--;
                success = true;
            }

            temp = temp.next;
        }

        return success;
    }

    public int dishQuantity(){
        return curSize;
   }

     public int dishQuantity(String dishName){
       RestaurantOrder temp = queue;
       int count = 0;

       while(temp.next != null){
           if (temp.dish.getName() == dishName){
              count++;
           }

           temp = temp.next;
       }

       return count;
   }

    public void dequeue(){
        queue = queue.next;
        queue.prev = null;

        curSize--;
    }

    public Dish[] getDishes(){
        Dish[] dishArr = new Dish[curSize];
        int count = 0;
        RestaurantOrder temp = queue;
        dishArr[count] = dish;

        while(temp.next != null){
            dishArr[++count] = temp.dish;

            temp = temp.next;
        }

        return dishArr;
    }

    public double costTotal(){
        RestaurantOrder temp = queue;
        double cost = 0;

        while(temp.next != null){
            cost += temp.dish.getCost();

            temp = temp.next;
        }

        return cost;
    }

    public String[] dishesNames(){
        String[] nameArr = new String[curSize];
        int i = 0;

        RestaurantOrder temp = queue;
        nameArr[i] = dish.getName();

        while(temp.next != null){
            nameArr[++i] = temp.dish.getName();

            temp = temp.next;
        }

        return nameArr;
    }

    public void show(){
       System.out.println(this.dish.getCost()+" "+this.dish.getName()+" "+this.dish.getDescription());
        RestaurantOrder temp = queue;
        System.out.println(temp.dish.getCost()+" "+temp.dish.getName()+" "+temp.dish.getDescription());
        while(temp.next != null){
            temp = temp.next;
            System.out.println(temp.dish.getCost()+" "+temp.dish.getName()+" "+temp.dish.getDescription());
        }
   }

    public boolean isEmpty(){
        return (curSize == 0);
    }

    public int getSize(){
        return curSize;
    }

    public void clear() {
        while(queue.next != null){
            queue.dequeue();
        }
    }
}
