package ru.mirea.Naumov.lab16;

public interface IOrder {

    public boolean add (Item item);

    public boolean remove(String dishName);
    public boolean removeAll(String dishName);

    public int dishQuantity();

    public int dishQuantity(String dishName);

    public void dequeue();

    public Item[] getDishes();

    public double costTotal();

    public String[] dishesNames();

    public void show();

    public boolean isEmpty();

    public int getSize();

    public void clear();
}
