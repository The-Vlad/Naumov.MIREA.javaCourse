package ru.mirea.Naumov.lab11.task3;

public class Const implements IMathObject{
    private final float c;

    public Const(float c){
        this.c = c;
    }

    @Override
    public float evaluate(float variable) {
        return this.c;
    }
}
