package ru.mirea.Naumov.lab8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    /**
     * Protected field used to contain some data of the Wait List.
     * This field has type ConcurrentLinkedQueue, which implements
     * the structure of data in WaitList class
     */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Default constructor, which defines content field
     */
    public WaitList(){
        content = new ConcurrentLinkedQueue<E>();
    }

    /**
     * Constructor of the WaitList class which defines content field
     * with sending collection "c" to this field
     * @param c the collection, which contains a set of data
     */
    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<E>(c);
    }

    /**
     * Returns a string representation of this collection.
     * The string representation consists of a list
     * of the collection's elements in the order
     * they are returned by its iterator, enclosed
     * in square brackets ("[]"). Adjacent elements
     * are separated by the characters ", "
     * (comma and space). Elements are converted
     * to strings as by String.valueOf(Object).
     *
     * @Overrides: toString in class AbstractCollection
     * toString in class Object
     * @return a string representation of this collection
     *
     * @see ConcurrentLinkedQueue
     */
    public String toString(){
        return content.toString();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmtpy() {
        return content.isEmpty();
    }
}
