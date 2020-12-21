package ru.mirea.Naumov.lab12.task4;

public class Tester {
    public static void main(String[] args) {
        String str = "89149692089";
        System.out.println(NewString.normalize(str));

        String str1 = "+79149692089";
        System.out.println(NewString.normalize(str1));

        String str2 = "9149692089";
        System.out.println(NewString.normalize(str2));
    }
}
