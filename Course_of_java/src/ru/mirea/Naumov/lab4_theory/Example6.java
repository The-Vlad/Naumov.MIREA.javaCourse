package ru.mirea.Naumov.lab4_theory;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example6 extends JFrame {
    JLabel lbl = new JLabel("");
    public Example6(){
        super("Поиск мыши");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setVisible(true);

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
    }

    public static void main (String[] args){
        new Example6();
    }
}
