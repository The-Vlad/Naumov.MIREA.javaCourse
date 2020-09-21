package ru.mirea.Naumov.lab4_theory;
import java.awt.*;
import javax.lang.model.util.Elements;
import javax.swing.*;
import java.awt.event.*;

public class Example2 extends JFrame{
    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JButton button = new JButton("Просуммировать");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Example2(){
        super("Проверка поддержки русского языка");
        setLayout(new FlowLayout());
        setSize(300, 400);

        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2-е число"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null,
                            "Result = "+(x1+x2),
                            "Моё объявление, Слушай!",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }

                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Ошибка, это не числа!",
                            "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args){
        new Example2();
    }
}
