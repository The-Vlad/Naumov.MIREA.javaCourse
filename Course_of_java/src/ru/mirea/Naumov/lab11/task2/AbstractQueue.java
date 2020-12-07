package ru.mirea.Naumov.lab11.task2;

public abstract class AbstractQueue {
    public abstract void enqueue(int elem);

    public abstract int dequeue();

    public abstract int element();

    public abstract boolean isEmpty();

    public abstract int getSize();

    public abstract void clear();
}
