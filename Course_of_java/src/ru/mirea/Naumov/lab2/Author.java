package ru.mirea.Naumov.lab2;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "The author is "+this.name+".\nGender: "+this.gender+".\nEmail: "+this.email;
    }
}
