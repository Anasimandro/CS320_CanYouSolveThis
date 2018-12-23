package View;

import Controller.*;
import Model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Observer;

public class GameView implements Observer {

    public static final Dimension GAME_PANEL_SIZE = new Dimension(1200, 600);

    private Game model;
    private GameController controller;
    private JFrame gameFrame;
    // TODO private GamePanel gamePanel;
    private JPanel startScreenPanel;
    private JPanel categorySelectionPanel;
    private JPanel previousScoresScreenPanel;


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


        createStartScreenPanel();

        gameFrame.add(startScreenPanel);

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

        JButton startButton = new JButton();
        JButton previousScores = new JButton();
        JButton exitButton = new JButton();

        JPanel startButtonPanel = new JPanel();
        startButton.setText("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 30));
        startButton.setPreferredSize(new Dimension(400, 80));
        startButton.addActionListener(e -> {
            gameFrame.remove(startScreenPanel);
            gameFrame.repaint();
            gameFrame.revalidate();
            createCategorySelectionScreen();
        }); // TODO on controller

        JPanel previousScoresPanel = new JPanel();
        previousScores.setText("Previous Scores");
        previousScores.setFont(new Font("Arial", Font.PLAIN, 30));
        previousScores.setPreferredSize(new Dimension(400, 80));
        previousScores.addActionListener(e -> {
            gameFrame.remove(startScreenPanel);
            gameFrame.repaint();
            gameFrame.revalidate();
            try {
                createPreviousScoresScreen();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        JPanel exitButtonPanel = new JPanel();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 30));
        exitButton.setPreferredSize(new Dimension(400, 80));
        exitButton.addActionListener((ActionEvent e) -> gameFrame.dispatchEvent(new WindowEvent(gameFrame, WindowEvent.WINDOW_CLOSING))); //TODO on controller

        startScreenPanel.add(label, BorderLayout.NORTH);

        startButtonPanel.add(startButton);
        startScreenPanel.add(startButtonPanel);

        previousScoresPanel.add(previousScores);
        startScreenPanel.add(previousScoresPanel);

        exitButtonPanel.add(exitButton);
        startScreenPanel.add(exitButtonPanel);

        gameFrame.add(startScreenPanel);
        gameFrame.repaint();
        gameFrame.revalidate();

    }

    public void createCategorySelectionScreen() {

        categorySelectionPanel = new JPanel();
        categorySelectionPanel.setLayout(new GridLayout(6,1));

        JLabel label = new JLabel("Choose a category!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(600, 60);
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        JPanel celebritiesPanel = new JPanel();
        JButton celebrities = new JButton();
        JPanel moviesPanel = new JPanel();
        JButton movies = new JButton();
        JPanel historyPanel = new JPanel();
        JButton history = new JButton();
        JPanel musicPanel = new JPanel();
        JButton music = new JButton();
        JPanel foodPanel = new JPanel();
        JButton food = new JButton();

        celebrities.setText("Celebrities");
        celebrities.setFont(new Font("Arial", Font.PLAIN, 20));
        celebrities.setPreferredSize(new Dimension(300, 50));
        celebrities.setBackground(Color.RED);
        celebrities.addActionListener((ActionEvent e) -> {

            gameFrame.remove(categorySelectionPanel);
            GamePanel celebritiesGame = new GamePanel("Celebrities");
            gameFrame.add(celebritiesGame.getGamePanel());
            gameFrame.repaint();
            gameFrame.revalidate();
        });

        movies.setText("Movies");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setPreferredSize(new Dimension(300, 50));
        movies.setBackground(Color.CYAN);

        history.setText("History");
        history.setFont(new Font("Arial", Font.PLAIN, 20));
        history.setPreferredSize(new Dimension(300, 50));
        history.setBackground(Color.GREEN);


        music.setText("Music");
        music.setFont(new Font("Arial", Font.PLAIN, 20));
        music.setPreferredSize(new Dimension(300, 50));
        music.setBackground(Color.YELLOW);

        food.setText("Food");
        food.setFont(new Font("Arial", Font.PLAIN, 20));
        food.setPreferredSize(new Dimension(300, 50));
        food.setBackground(Color.ORANGE);


        categorySelectionPanel.add(label);
        celebritiesPanel.add(celebrities);
        categorySelectionPanel.add(celebritiesPanel);
        moviesPanel.add(movies);
        categorySelectionPanel.add(moviesPanel);
        historyPanel.add(history);
        categorySelectionPanel.add(historyPanel);
        musicPanel.add(music);
        categorySelectionPanel.add(musicPanel);
        foodPanel.add(food);
        categorySelectionPanel.add(foodPanel);

        gameFrame.add(categorySelectionPanel);

        gameFrame.repaint();
        gameFrame.revalidate();
    }

    public void createPreviousScoresScreen() throws IOException {

        previousScoresScreenPanel = new JPanel();
        previousScoresScreenPanel.setLayout(new GridLayout(12,1));

        JLabel[] scoreLabels = new JLabel[10];
        String[] previousS = controller.givePreviousScores();
        JLabel previousScoresTitle = new JLabel();
        previousScoresTitle.setText("Previous Scores");
        previousScoresTitle.setHorizontalAlignment(JLabel.CENTER);
        previousScoresTitle.setSize(600, 60);
        previousScoresTitle.setFont(new Font("Serif", Font.PLAIN, 50));

        previousScoresScreenPanel.add(previousScoresTitle);

        for(int i = 0; i < previousS.length ; i++) {
            scoreLabels[i] = new JLabel();
            scoreLabels[i].setHorizontalAlignment(JLabel.CENTER);
            scoreLabels[i].setText(previousS[i]);
            scoreLabels[i].setFont(new Font("Serif", Font.PLAIN, 30));
            previousScoresScreenPanel.add(scoreLabels[i]);
        }

        JPanel goBackButtonPanel = new JPanel();

        JButton goBackButton = new JButton();
        goBackButton.setText("Go Back");
        goBackButton.setFont(new Font("Arial", Font.PLAIN, 20));
        goBackButton.setBackground(Color.CYAN);
        goBackButton.addActionListener(e -> {
            gameFrame.remove(previousScoresScreenPanel);
            gameFrame.repaint();
            gameFrame.revalidate();
            createStartScreenPanel();
        });

        goBackButtonPanel.add(goBackButton);
        previousScoresScreenPanel.add(goBackButtonPanel);

        gameFrame.add(previousScoresScreenPanel);
        gameFrame.repaint();
        gameFrame.revalidate();
    }

    public void update(java.util.Observable o, Object arg) {
        gameFrame.repaint();
    }

}


