package ru.mirea.Naumov.lab5;
import java.lang.*;
import java.util.Scanner;

public class Exercise12 {
    private static void recursion(){
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if(N != 0){
            if (N % 2 != 0) System.out.println("Нечётное чилсло: "+N);
            recursion();
        }
        else {
            System.out.println("Конец программы");
        }
    }

    public static void main(String[] args){
        recursion();
    }
}
