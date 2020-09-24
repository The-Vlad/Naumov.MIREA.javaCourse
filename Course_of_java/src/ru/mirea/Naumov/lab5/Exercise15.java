package ru.mirea.Naumov.lab5;
import java.lang.*;

public class Exercise15 {
    private int N;

    private static void recursion(int n){
         System.out.println(n % 10);
         recursion(n % 10);
    }

    public static void main(String[] args){
        N = 1298;

        recursion (N);
    }
}
