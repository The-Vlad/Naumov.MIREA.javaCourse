package ru.mirea.Naumov.lab11.task1;

import ru.mirea.Naumov.lab11.task2.*;
import java.util.Collection;

public interface ArrayQueueADT<E> {
    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions, returning
     * {@code true} upon success and throwing an {@code IllegalStateException}
     * if no space is currently available.
     *
     * @param elem the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     */

    public void enqueue(E elem);


    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public int dequeue();

    /**
     * Retrieves, but does not remove, the head of this queue.  This method
     * differs from only in that it throws an exception
     * if this queue is empty.
     *
     * @return the head of this queue
     */
    public int element();

    /**
     * Check if the Queue is Emtpy
     *
     * @return the true if empty
     */

    public boolean isEmpty();
    /**
     * Returns size of queue
     *
     * @return current size of queue
     */
    public int getSize();


    /**
     * Retrieves and removes all elements in queue.
     *
     * @return nothing
     */
    public void clear();
}
