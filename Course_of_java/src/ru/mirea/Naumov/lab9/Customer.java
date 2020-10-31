package ru.mirea.Naumov.lab9;

import java.util.Comparator;

public class Customer implements Comparable<Customer>, Comparator<Customer> {
    public int idNumber;
    public String name;

    public Customer(){
        this.idNumber = 0;
        this.name = "Unknown";
    }

    public Customer(int idNumber){
        this.idNumber = idNumber;
    }

    public Customer(int idNumber, String name){
        this.idNumber = idNumber;
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name+" has ID = "+idNumber;
    }

    @Override
    public int compareTo(Customer object) {
        if (this.idNumber < object.idNumber) return 1;
        else if (this.idNumber > object.idNumber) return -1;
        else return 0;
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.name.compareTo(o2.name);
    }

}
