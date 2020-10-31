package ru.mirea.Naumov.lab10.ex2;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("MAGIC!!!");
    }

    @Override
    public String toString() {
        return "magic chair";
    }
}
