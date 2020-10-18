package ru.mirea.Naumov.lab8;

import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Default constructor that call Wait List default constructor
     */
    public UnfairWaitList(){
        super();
    }

    /**
     * Removes specified element from the collection.
     * @param element the element that will be removed
     * @return nothing
     */
    public void remove(E element){
        Iterator iterator = content.iterator();

        while(iterator.hasNext()){
            if(iterator.next() == element) {
                iterator.remove();

                return;
            }
        }
    }

    /**
     * Moves specified element to the tail of the collection
     * @param element the element that will be moved
     * @return nothing
     */
    public void moveToBack(E element){
        Iterator iterator = content.iterator();

        while(iterator.hasNext()){
            if(iterator.next() == element){
                iterator.remove();
                content.add(element);

                return;
            }
        }
    }
}
