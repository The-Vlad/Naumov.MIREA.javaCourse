package ru.mirea.Naumov.lab10.ex2;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sit on a "+chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
