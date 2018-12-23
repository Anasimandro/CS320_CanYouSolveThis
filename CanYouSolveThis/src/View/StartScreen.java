package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;



public class StartScreen extends JPanel {
    private JPanel startScreenPanel;


    public StartScreen() {

        startScreenPanel = new JPanel();
        startScreenPanel.setSize(GameView.GAME_PANEL_SIZE);
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

        JPanel previousScoresPanel = new JPanel();
        previousScores.setText("Previous Scores");
        previousScores.setFont(new Font("Arial", Font.PLAIN, 30));
        previousScores.setPreferredSize(new Dimension(400, 80));

        JPanel exitButtonPanel = new JPanel();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 30));
        exitButton.setPreferredSize(new Dimension(400, 80));

        //exitButton.addActionListener((ActionEvent e) -> gameFrame.dispatchEvent(new WindowEvent(gameFrame, WindowEvent.WINDOW_CLOSING)));

        startScreenPanel.add(label, BorderLayout.NORTH);

        startButtonPanel.add(startButton);
        startScreenPanel.add(startButtonPanel);

        previousScoresPanel.add(previousScores);
        startScreenPanel.add(previousScoresPanel);

        exitButtonPanel.add(exitButton);
        startScreenPanel.add(exitButtonPanel);

    }

    public JPanel getPanel() {
        return startScreenPanel;
    }
}
