package ru.mirea.Naumov.lab9;

public class WrongIDNumberException extends Exception{
    public WrongIDNumberException(String errorMessage){
        super(errorMessage);
    }
}
