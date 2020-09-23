package ru.mirea.Naumov.lab4;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResultsTable extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Program");
    JMenuItem menuItemRestart = new JMenuItem("Restart");
    JMenuItem menuItemExit = new JMenuItem("Exit");

    JButton jbtnMilan= new JButton("AC Milan");
    JButton jbtnMadrid = new JButton("Real Madrid");
    JButton jbtnEndGame = new JButton("End the game");
    JLabel jlblResult = new JLabel("Result: 0 X 0");
    JLabel jlblLastScorer = new JLabel("Last Scorer: N/A");
    Label lblwinner = new Label("Winner: N/A");

    int milanScore = 0;
    int madridScore = 0;

    JPanel[] pnl = new JPanel[40];

    public ResultsTable(){
        super("Таблица результатов");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setJMenuBar(menuBar);

        menuBar.add(menu);
        menu.add(menuItemRestart);
        menu.add(menuItemExit);

        jbtnMilan.setBounds(25, 100, 150, 25);
        jbtnEndGame.setBounds(25, 150, 150, 25);
        jbtnMadrid.setBounds(25, 200, 150, 25);
        jlblResult.setBounds(230, 100, 150, 25);
        jlblLastScorer.setBounds(230, 150, 150, 25);
        lblwinner.setBounds(230, 200, 150, 25);

        add(jbtnMilan);
        add(jbtnMadrid);
        add(jlblResult);
        add(jlblLastScorer);
        add(lblwinner);
        add(jbtnEndGame);

        jbtnMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                jlblResult.setText("Result: "+milanScore+" X "+madridScore);
                jlblLastScorer.setText("Last Scorer: AC Milan");
            }
        });
        jbtnMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                jlblResult.setText("Result: "+milanScore+" X "+madridScore);
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
        menuItemRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore = 0;
                madridScore = 0;
                jlblResult.setText("Result: 0 X 0");
                jlblLastScorer.setText("Last Scorer: N/A");
                lblwinner.setText("Winner: N/A");
            }
        });
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new ResultsTable();
    }
}
