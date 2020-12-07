package ru.mirea.Naumov.lab11.task1;

import ru.mirea.Naumov.lab11.task2.*;

public class ArrayQueue extends AbstractQueue implements Queue{
    private int [] queue;
    private int maxSize;
    private int curSize;
    private int start;
    private int end;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        queue = new int [maxSize];
        curSize = 0;
        start = 0;
        end = -1;
    }

    public void enqueue(int elem){
        if (curSize < maxSize){
            if (end == maxSize - 1){
                end = -1;
            }

            queue[++end] = elem;
            curSize++;
        }
    }

    public int dequeue(){
        int temp = queue[start];

        if(start == maxSize){
            start = 0;
        }
        curSize--;

        return temp;
    }

    public int element(){
        return queue[start];
    }

    public boolean isEmpty(){
        return (curSize == 0);
    }

    public int getSize(){
        return curSize;
    }

    public void clear(){
        queue = null;
    }
}
