package ru.mirea.Naumov.lab8;

public class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Private field used to define the capacity of the Wait List
     * This field has type int, which limits the number of items
     * that can be added
     */
    private int capacity;

    /**
     * Constructor that defines capacity field and call Wait List
     * default constructor.
     * @param capacity the field that limits the number of items
     *                 that can be added
     */
    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    /**
     * This method returns the capacity of the object
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Adds element to the Wait List if it has free space for this
     * @Overrides: "add" method in class WaitList
     * @param element the element, which will be added
     */
    @Override
    public void add(E element) {
        if (super.content.size() < capacity) {
            super.add(element);
        }
        else System.out.println("Bounded wait list is full!");
    }

    /**
     * Returns the capacity, size and a string representation of this collection.
     *      * The string representation consists of a list
     *      * of the collection's elements in the order
     *      * they are returned by its iterator, enclosed
     *      * in square brackets ("[]"). Adjacent elements
     *      * are separated by the characters ", "
     *      * (comma and space). Elements are converted
     *      * to strings as by String.valueOf(Object).
     *      *
     *      * @Overrides: toString in class AbstractCollection
     *      * toString in class Object
     *      * @return a string representation of this collection
     *      *
     *      * @see ConcurrentLinkedQueue
     */
    public String toSrtring(){
        return "Capacity is: "+capacity+", Size is: "+super.content.size()+"\n"+super.toString();
    }
}
