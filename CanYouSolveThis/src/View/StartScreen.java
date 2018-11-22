package View;
import javax.swing.*;
import java.awt.*;

public class StartScreen {
    private JPanel panel;
    public StartScreen() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Can You Solve This");
        label.setSize(600,60);
        label.setLocation(400,70);
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        JButton startButton = new JButton();
        JButton exitButton = new JButton();


        startButton.setText("Start");
        startButton.setFont(new Font("Arial", Font.PLAIN, 30));
        startButton.setSize(400,80);
        startButton.setLocation(400, 300);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 30));
        exitButton.setSize(400,80);
        exitButton.setLocation(400,400);



        panel.add(label);


        panel.add(startButton);
        panel.add(exitButton);


    }

    public JPanel getPanel() {
        return panel;
    }
}
