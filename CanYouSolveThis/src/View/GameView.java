package View;

import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;

import java.awt.event.WindowEvent;
import java.util.Observer;

public class GameView implements Observer {

    private Game model;
    private GameController controller;
    private JFrame gameFrame;
    private GamePanel gamePanel;


    public GameView(Game model, GameController controller) {
        this.model = model;
        this.controller = controller;
        controller.setView(this);
        createControls();

    }

    public void createControls() {

        gameFrame = new JFrame("Can You Solve This");
        gameFrame.setSize(1200, 600);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        createStartScreenPanel();

        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
        gameFrame.setVisible(true);

    }

    public void createStartScreenPanel() {

        JPanel startScreenPanel = new JPanel();
        startScreenPanel.setLayout(null);

        JLabel label = new JLabel("Can You Solve This");
        label.setSize(600, 60);
        label.setLocation(400, 70);
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        JButton startButton = new JButton();
        JButton previousScores = new JButton();
        JButton exitButton = new JButton();

        // startButton.addActionListener(StartScreenListener);
        // exitButton.addActionListener(StartScreenListener);


        startButton.setText("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 30));
        startButton.setSize(400, 80);
        startButton.setLocation(400, 200);

        previousScores.setText("Previous Scores");
        previousScores.setFont(new Font("Arial", Font.PLAIN, 30));
        previousScores.setSize(400, 80);
        previousScores.setLocation(400, 300);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 30));
        exitButton.setSize(400, 80);
        exitButton.setLocation(400, 400);


        startScreenPanel.add(label);


        startScreenPanel.add(startButton);
        startScreenPanel.add(previousScores);
        startScreenPanel.add(exitButton);

    }




    public void update(java.util.Observable o, Object arg) {
        gameFrame.repaint();
    }

}
