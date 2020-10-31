package ru.mirea.Naumov.lab9;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
