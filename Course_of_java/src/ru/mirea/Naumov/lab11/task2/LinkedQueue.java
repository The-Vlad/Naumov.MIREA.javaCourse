package ru.mirea.Naumov.lab11.task2;

public class LinkedQueue extends AbstractQueue implements Queue{
    private LinkedQueue queue = null;
    private LinkedQueue next = null;
    private LinkedQueue prev = null;
    private int value;
    private int curSize;

    public LinkedQueue(int value){
       this.value = value;
    }

    public void enqueue (int elem){
            LinkedQueue insertion = new LinkedQueue(elem);
            if(queue == null){
                queue = insertion;
            }

            else
            {
                LinkedQueue lastElem = queue;
                while(lastElem.next != null){
                    lastElem = lastElem.next;
                }
                lastElem.next = insertion;
                insertion.prev = lastElem;
            }

            curSize++;
    }

    public int dequeue(){
        LinkedQueue temp = queue;

        queue = queue.next;
        queue.prev = null;

        curSize--;

        return temp.value;
    }

    public int element(){
        return queue.value;
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
