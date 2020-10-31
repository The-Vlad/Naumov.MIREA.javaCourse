package ru.mirea.Naumov.lab10.ex1;

public class ComplexTester {
    public static void main(String[] args){
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex number = factory.createComplex(20, 35);

        System.out.println("Real = "+number.real+"; Image = "+number.image);
    }
}
