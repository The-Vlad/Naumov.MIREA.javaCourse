package ru.mirea.Naumov.lab11.task1;

import ru.mirea.Naumov.lab11.task2.*;

public class ArrayQueueModule implements Queue {
    private int maxSize = 20;
    private int [] queue = new int [maxSize];
    private int curSize = 0;
    private int start = 0;
    private int end = -1;


    public void enqueue (int elem){
        if (curSize < maxSize){
            if (end == maxSize - 1){
                end = -1;
            }

            queue[++end] = elem;
            curSize++;
        }
    }

    public int dequeue(){
        int temp = queue[start++];

        if(start == maxSize){
            start = 0;
        }
        curSize--;

        return temp;
    }

    public int element() {
        return queue[start];
    }

    public int getEnd() {
        return queue[end];
    }

    public boolean isFull() {
        return (curSize == maxSize);
    }

    public boolean isEmpty() {
        return (curSize == 0);
    }

    public int getSize() {
        return curSize;
    }

    public void clear(){
        queue = null;
    }
}
