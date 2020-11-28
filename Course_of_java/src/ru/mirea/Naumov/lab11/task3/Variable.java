package ru.mirea.Naumov.lab11.task3;

public class Variable implements IMathObject{
    private String variable;
    private float value;

    public Variable(String variable){
        this.variable = variable;
    }

    @Override
    public float evaluate(float variable) {
        this.value = variable;
        return value;
    }
}
