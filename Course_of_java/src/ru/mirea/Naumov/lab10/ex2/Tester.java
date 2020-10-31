package ru.mirea.Naumov.lab10.ex2;

public class Tester {
    public static void main(String[] args){
        Client cl = new Client();
        AbstractChairFactory factory = new ChairFactory();

        cl.setChair(factory.createVictorianChair(15));
        cl.sit();
        int age =((VictorianChair)cl.chair).getAge();
        System.out.println("The age of victorian chair is: "+age+"\n");

        cl.setChair(factory.createMagicChair());
        cl.sit();
        ((MagicChair)cl.chair).doMagic();
        System.out.println();

        cl.setChair(factory.createFunctionalChair());
        cl.sit();
        int sum = ((FunctionalChair)cl.chair).sum(3,5);
        System.out.println("The sum is: "+sum+"\n");
    }
}
