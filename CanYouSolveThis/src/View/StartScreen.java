package View;
import javax.swing.*;
import java.awt.*;

public class StartScreen {
    private JPanel panel;
    public StartScreen() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));


        JLabel label = new JLabel("Welcome to our mini game Can You Solve This");
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        JLabel labelempty = new JLabel();



        JButton startButton = new JButton();
        JButton exitButton = new JButton();


        startButton.setText("Start");
        exitButton.setText("Exit");



        panel.add(label);
        panel.add(labelempty);

        panel.add(startButton);
        panel.add(exitButton);

    }

    public JPanel getPanel() {
        return panel;
    }
}
