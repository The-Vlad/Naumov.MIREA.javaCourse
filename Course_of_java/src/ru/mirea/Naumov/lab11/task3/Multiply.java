package ru.mirea.Naumov.lab11.task3;

public class Multiply implements IMathObject{
    IMathObject obj1, obj2;

    public Multiply(IMathObject obj1, IMathObject obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public float evaluate(float variable){
        return obj1.evaluate(variable) * obj2.evaluate(variable);
    }
}