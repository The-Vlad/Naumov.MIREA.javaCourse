package ru.mirea.Naumov.lab1;
import java.lang.*;

public class Book {
    private String name;
    private int page;

    public Book(String name, int page){
        this.name = name;
        this.page = page;
    }
    public  Book(String name){
        this.name = name;
        page = 100;
    }
    public Book(int page)
    {
        name = "Unknown";
        this.page = page;
    }
    public Book(){
        name = "Unknown";
        page = 100;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPage(int page){
    this.page = page;
    }

    public String getName() {
        return name;
    }
    public int getPage() {
        return page;
    }

    public String toString(){
        return "This book's name is: "+name+", number of pages is: "+page;
    }
}
