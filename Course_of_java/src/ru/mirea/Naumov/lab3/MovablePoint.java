package ru.mirea.Naumov.lab3;
import java.lang.*;

public class MovablePoint implements Movable{
    protected int x, y;
    protected int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Class MovablePoint\n"+"x = "+x+"\ny = "+y+
                "\nxSpeed = "+xSpeed+"\nySpeed = "+ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x += xSpeed;
    }

    @Override
    public void moveRight() {
        x -= xSpeed;
    }
}
