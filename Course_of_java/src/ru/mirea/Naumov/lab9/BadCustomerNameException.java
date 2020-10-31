package ru.mirea.Naumov.lab9;

public class BadCustomerNameException extends Exception{
    public BadCustomerNameException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
