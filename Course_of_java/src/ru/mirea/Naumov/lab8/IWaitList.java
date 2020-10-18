package ru.mirea.Naumov.lab8;

import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Adds element to Wait List
     * @param element the element, which will be add to the tail of Wait List
     * @return nothing
     */
    public void add(E element);

    /**
     * Removes element from the head of the Wait List
     * @return object of the E type
     */
    public E remove();

    /**
     * Checks if the Wait List contains element
     * @param element the element, which will be checked for containing in Wait List
     * @return true if contains, else returns false
     */
    public boolean contains(E element);

    /**
     * Checks if the Wait List contains collection
     * @param c the collection of the type E
     * @return true if contains, else returns false
     */
    public boolean containsAll(Collection<E> c);

    /**
     * Checks if the Wait List is empty
     * @return true if is empty, else returns false
     */
    public boolean isEmtpy();
}
