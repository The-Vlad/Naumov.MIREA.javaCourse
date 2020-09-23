package ru.mirea.Naumov.lab4_theory;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example7 extends JFrame {
    JLabel lbl = new JLabel("");

    JMenuBar jmb = new JMenuBar();
    JMenu jm = new JMenu("Тестим 1-ю вкладку");
    JMenuItem jmi = new JMenuItem("Первый элемент");
    JMenuItem jmiWithAction = new JMenuItem(new ThrowMessage()); // class extended from AbstractAction

    // Вложенный класс
    class ThrowMessage extends AbstractAction{
        ThrowMessage(){
            putValue(NAME, "ВЫЗОВ КОНСОЛИ!!! УРА!");
        }
        public void actionPerformed(ActionEvent e){
            System.out.println("It works!!!");
        }
    }

    public Example7(){
        super("Проверка работоспособности меню");


        add(lbl, BorderLayout.SOUTH);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl.setText("X = " + e.getX()+" Y = "+e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jm.add(jmiWithAction);
        jm.add(jmi);    // Also use: jmb.add(someFunction());
        // This someFunction() must return object, which type is JMenu
        jmb.add(jm);
        setJMenuBar(jmb);
    }

    public static void main (String[] args){
        new Example7();
    }
}
