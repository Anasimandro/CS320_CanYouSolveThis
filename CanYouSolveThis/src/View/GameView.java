package View;

import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Observer;

public class GameView implements Observer {

    private static final Dimension GAME_PANEL_SIZE = new Dimension(1200, 600);

    private Game model;
    private GameController controller;
    public JFrame gameFrame;
    // TODO private GamePanel gamePanel;
    private JPanel startScreenPanel;
    private JButton startButton;
    private JButton previousScores;
    private JButton exitButton;


    public GameView(Game model, GameController controller) {
        this.model = model;
        this.controller = controller;
        controller.setView(this);
        createGameFrame();

    }

    public void createGameFrame() {
        gameFrame = new JFrame("Can You Solve This? ");
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameFrame.setPreferredSize(GAME_PANEL_SIZE);

        Container contentPane = gameFrame.getContentPane();
        createStartScreenPanel();

        contentPane.add(startScreenPanel);

        gameFrame.pack();
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
        gameFrame.setVisible(true);
    }


    public void createStartScreenPanel() {

        startScreenPanel = new JPanel();
        startScreenPanel.setSize(GAME_PANEL_SIZE);
        startScreenPanel.setLayout(new GridLayout(4, 1));

        JLabel label = new JLabel("Can You Solve This?");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        startButton = new JButton();
        previousScores = new JButton();
        exitButton = new JButton();

        JPanel startButtonPanel = new JPanel();
        startButton.setText("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 30));
        startButton.setPreferredSize(new Dimension(400, 80));

        JPanel previousScoresPanel = new JPanel();
        previousScores.setText("Previous Scores");
        previousScores.setFont(new Font("Arial", Font.PLAIN, 30));
        previousScores.setPreferredSize(new Dimension(400, 80));

        JPanel exitButtonPanel = new JPanel();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 30));
        exitButton.setPreferredSize(new Dimension(400, 80));

        exitButton.addActionListener((ActionEvent e) ->
                gameFrame.dispatchEvent(new WindowEvent(gameFrame, WindowEvent.WINDOW_CLOSING))
        );

        startScreenPanel.add(label, BorderLayout.NORTH);

        startButtonPanel.add(startButton);
        startScreenPanel.add(startButtonPanel);

        previousScoresPanel.add(previousScores);
        startScreenPanel.add(previousScoresPanel);

        exitButtonPanel.add(exitButton);
        startScreenPanel.add(exitButtonPanel);

    }


    public void update(java.util.Observable o, Object arg) {
        gameFrame.repaint();
    }

}
