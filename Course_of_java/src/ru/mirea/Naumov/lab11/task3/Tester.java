package ru.mirea.Naumov.lab11.task3;

public class Tester {
    public Tester(){
        float result = new Subtract(
                new Multiply(
                        new Const(2),
                        new Variable("x")
                ),
                new Const(3)
        ).evaluate(5);

        float res = new Divide(new Const(1), new Variable("y")).evaluate(0);
        System.out.println("Result is: "+res);
    }

    public static void main(String[] args) {
        new Tester();
    }
}
