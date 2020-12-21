package ru.mirea.Naumov.lab12.task2;

public class Tester {
    public static void main(String[] args) {
        String test = "Россия, Москва, Москва, пр-т Мира, 8, ст.2, 1";
        Adress test1 = new Adress();
        test1.splitAddress(test);
        System.out.println(test1);

        Adress test2 = new Adress();
        test2.tokenizeAddress(test);
        System.out.println(test2);

    }}
