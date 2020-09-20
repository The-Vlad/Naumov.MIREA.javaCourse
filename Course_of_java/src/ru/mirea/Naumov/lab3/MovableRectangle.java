package ru.mirea.Naumov.lab3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;

        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString(){
        return "Class MovableRectangle\n"+"x1 = "+topLeft.x+"\ny1 = "+topLeft.y+
                "\nx2 = "+bottomRight.x+"\ny2 = "+bottomRight.y+
                "\nxSpeed = "+topLeft.xSpeed+"\nySpeed = "+topLeft.ySpeed;
    }

    public void moveUp(){
       topLeft.y += topLeft.ySpeed;
       bottomRight.y += bottomRight.ySpeed;
    }

    public void moveDown(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveLeft(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public void moveRight(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
}
