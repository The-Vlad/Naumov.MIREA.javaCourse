package ru.mirea.Naumov.lab10.ex2;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "victorian chair";
    }
}
