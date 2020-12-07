package ru.mirea.Naumov.lab11.task2;

public interface Queue {
    // If queue is not full the element will be added
    public void enqueue (int elem);

    public int dequeue();

    public int element();

    public boolean isEmpty();

    public int getSize();

    public void clear();

}
