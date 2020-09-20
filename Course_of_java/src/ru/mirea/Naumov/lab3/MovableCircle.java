package ru.mirea.Naumov.lab3;
import java.lang.*;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
       center.x = x;
       center.y = y;
       center.xSpeed = xSpeed;
       center.ySpeed = ySpeed;
       this.radius = radius;
    }

    public String toString(){
        return "Class MovableCircle\n"+"x = "+center.x+"\ny = "+center.y+
                "\nxSpeed = "+center.xSpeed+"\nySpeed = "+center.ySpeed+"\nRadius = "+radius;
    }

    public void moveUp(){
        center.y += center.ySpeed;
    }
    public void moveDown(){
        center.ySpeed -= center.ySpeed;
    }
    public void moveLeft(){
        center.x += center.xSpeed;
    }
    public void moveRight(){
        center.x -= center.xSpeed;
    }
}
