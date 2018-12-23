package View;

import Controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class EndScreenWithScore {
    private JPanel endScreenWithScorePanel;
    private GameController controller;

    public EndScreenWithScore() throws IOException {
        this.controller = controller;
        endScreenWithScorePanel = new JPanel();
        endScreenWithScorePanel.setLayout(new GridLayout(15,1));

        JLabel gameOverLabel = new JLabel("Game Over");
        JLabel pointsLabel = new JLabel("Points: ");
        endScreenWithScorePanel.add(gameOverLabel);
        endScreenWithScorePanel.add(pointsLabel);

        JLabel[] scoreLabels = new JLabel[10];
        String[] previousS = controller.givePreviousScores();
        JLabel previousScoresTitle = new JLabel();
        previousScoresTitle.setText("Previous Scores");
        previousScoresTitle.setHorizontalAlignment(JLabel.CENTER);
        previousScoresTitle.setSize(600, 60);
        previousScoresTitle.setFont(new Font("Serif", Font.PLAIN, 50));

        endScreenWithScorePanel.add(previousScoresTitle);

        for(int i = 0; i < previousS.length ; i++) {
            scoreLabels[i] = new JLabel();
            scoreLabels[i].setHorizontalAlignment(JLabel.CENTER);
            scoreLabels[i].setText(previousS[i]);
            scoreLabels[i].setFont(new Font("Serif", Font.PLAIN, 30));
            endScreenWithScorePanel.add(scoreLabels[i]);
        }

        JButton newGameButton = new JButton();
        JButton exitButton = new JButton();
        endScreenWithScorePanel.add(newGameButton);
        endScreenWithScorePanel.add(exitButton);
    }
    public JPanel getPanel() {
        return endScreenWithScorePanel;
    }
}
