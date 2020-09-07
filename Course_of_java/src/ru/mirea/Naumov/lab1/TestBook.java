package ru.mirea.Naumov.lab1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book ("War and Piece", 545);
        Book b2 = new Book ("Outer Space");
        Book b3 = new Book (345);

        b2.setPage(342);
        System.out.println(b3.getName());
        System.out.println(b1);
    }
}
