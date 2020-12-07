package ru.mirea.Naumov.lab11.task1;

public class Tester {
    public Tester(){

    }

    public static void main(String[] args){
        ArrayQueueModule queue = new ArrayQueueModule();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.getEnd());
        System.out.println(queue.element());
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(21);
        queue.enqueue(22);

        System.out.println("Result is:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
