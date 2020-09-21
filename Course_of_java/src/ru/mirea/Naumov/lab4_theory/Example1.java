package ru.mirea.Naumov.lab4_theory;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Example1(){
        //super("WINDOW NAME!");
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(jta);
        jta.setForeground(Color.GREEN);
        jta.setFont(fnt);

        setVisible(true);
    }

    public static void main(String[] args){
        new Example1();
    }
}
