package ru.mirea.Naumov.lab4;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResultsTable extends JFrame {
    JButton jbtnMilan= new JButton("AC Milan");
    JButton jbtnMadrid = new JButton("Real Madrid");
    JButton jbtnEndGame = new JButton("End the game");
    JLabel jlblResult = new JLabel("Result: 0 X 0");
    JLabel jlblLastScorer = new JLabel("Last Scorer: N/A");
    Label lblwinner = new Label("Winner: N/A");

    JPanel[] pnl = new JPanel[6];

    int milanScore = 0;
    int madridScore = 0;

    public ResultsTable(){
        super("Таблица результатов");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        pnl[2].add(jbtnMilan, BorderLayout.NORTH);
        pnl[2].add(jbtnMadrid, BorderLayout.SOUTH);
        pnl[3].add(jlblResult, BorderLayout.NORTH);
        pnl[3].add(jlblLastScorer, BorderLayout.CENTER);
        pnl[3].add(lblwinner, BorderLayout.SOUTH);


        jbtnMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                jlblResult.setText("Result: "+milanScore+"X"+madridScore);
                jlblLastScorer.setText("Last Scorer: AC Milan");
            }
        });
        jbtnMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                jlblResult.setText("Result: "+milanScore+"X"+madridScore);
                jlblLastScorer.setText("Last Scorer: RealMadrid");
            }
        });
        jbtnEndGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (milanScore > madridScore) lblwinner.setText("Winner: AC Milan");
                else if (milanScore < madridScore) lblwinner.setText("Winner: Real Madrid");
                else lblwinner.setText("Winner: DRAW");
            }
        });
    }

    public static void main(String[] args){
        new ResultsTable();
    }
}
