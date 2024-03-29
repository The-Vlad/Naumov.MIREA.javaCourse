package ru.mirea.Naumov.lab3;
import java.lang.*;

public class TesterClass {
    public static void main(String[] str){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version? (Circle version)
        System.out.println(s1.getArea()); // which version? (Circle version)
        System.out.println(s1.getPerimeter()); // which version? (Circle version)
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());
        // Происходит восходящее преобразование к базовому типу. getRadius()
        // не относится к методам класса Shape
        System.out.println();

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // Сработало за счёт нисходящего
        // преобразования к классу Circle
        System.out.println();

        // Shape s2 = new Shape();
        // Не сработает, так как нельзя создать экземпляр
        // абстрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); Аналогично примеру на 12 строчке
        System.out.println();

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println();

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
       // System.out.println(s4.getSide()); Аналогично примеру на 12 строчке
        System.out.println();

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        // Произошло нисходящее преобразование к классу Rectangle
        // Необходимо нисходящее преобразование к классу Square
        System.out.println(r2.getLength());
        System.out.println();

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        System.out.println();
    }
}
