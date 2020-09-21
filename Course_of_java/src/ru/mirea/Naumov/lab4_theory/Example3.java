package ru.mirea.Naumov.lab4_theory;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class Example3 extends JFrame{
    JTextArea jta1 = new JTextArea(10, 5);
    JScrollPane jScroll = new JScrollPane(jta1);
    JButton button = new JButton ("Добавить какой-нибудь текст");
    public Example3(){
        super("Проверка возможностей TextArea... (Это компонент?)");
        setSize (400, 450);
        setLayout(new FlowLayout());

        // add(jta1); because adding scroll Pane
        add(jScroll);
        add(button);
        jta1.append("Хахаха!");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null, "Вставить текст");
                jta1.append(txt);
            }
        });


    }

    public static void main(String[] args){
        new Example3().setVisible(true);
    }
}
