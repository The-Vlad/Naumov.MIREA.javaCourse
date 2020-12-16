package ru.mirea.Naumov.lab16;

public class InternetIOrder implements IOrder {
    private InternetIOrder queue = null;
    private InternetIOrder next = null;
    private InternetIOrder prev = null;
    private Item item;
    private int curSize;
    public int TableNumber;

    public InternetIOrder(Item item){
        this.item = item;
    }

    public boolean add (Item item){
        InternetIOrder insertion = new InternetIOrder(item);
        boolean success = false;

        if(queue == null){
            queue = insertion;
            success = true;
        }

        else
        {
            InternetIOrder lastElem = queue;
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
        InternetIOrder temp = queue;
        boolean success = false;

        while(temp.next != null){
            if (temp.item.getName() == dishName){
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
        InternetIOrder temp = queue;
        boolean success = false;

        while(temp.next != null){
            if (temp.item.getName() == dishName){
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
        InternetIOrder temp = queue;
        int count = 0;

        while(temp.next != null){
            if (temp.item.getName() == dishName){
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

    public Item[] getDishes(){
        Item[] dishArr = new Item[curSize];
        int count = 0;
        InternetIOrder temp = queue;
        dishArr[count] = item;

        while(temp.next != null){
            dishArr[++count] = temp.item;

            temp = temp.next;
        }

        return dishArr;
    }

    public double costTotal(){
        InternetIOrder temp = queue;
        double cost = 0;

        while(temp.next != null){
            cost += temp.item.getCost();

            temp = temp.next;
        }

        return cost;
    }

    public String[] dishesNames(){
        String[] nameArr = new String[curSize];
        int i = 0;

        InternetIOrder temp = queue;
        nameArr[i] = item.getName();

        while(temp.next != null){
            nameArr[++i] = temp.item.getName();

            temp = temp.next;
        }

        return nameArr;
    }

    public void show(){
        System.out.println(this.item.getCost()+" "+this.item.getName()+" "+this.item.getDescription());
        InternetIOrder temp = queue;
        System.out.println(temp.item.getCost()+" "+temp.item.getName()+" "+temp.item.getDescription());
        while(temp.next != null){
            temp = temp.next;
            System.out.println(temp.item.getCost()+" "+temp.item.getName()+" "+temp.item.getDescription());
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
