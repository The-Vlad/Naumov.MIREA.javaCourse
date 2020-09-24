package ru.mirea.Naumov.lab5;
import java.lang.*;
import java.util.Scanner;

public class Exercise15 {

    private static void recursion(int n){
        System.out.println(n % 10);
        if (n / 10 != 0){ recursion(n / 10);}
    }

    public static void main(String[] args){
        System.out.println("Введите значение: ");

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println("Цифры в обратном порядке:");
        recursion (N);
    }
}
