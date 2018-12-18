package View;

import javax.swing.*;
import java.awt.*;

public class PreviousScores {
    private JPanel panel;

    public PreviousScores() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("<html>PREVIOUS SCORES<br/>" +
                "400<br/>" +
                "230<br/>" + "5000<br/>" + "2000</html>");
        label.setSize(600, 600);
        label.setLocation(40, 70);
        label.setFont(new Font("Serif", Font.PLAIN, 20));

        panel.add(label);
    }

    public JPanel getPanel() {
        return panel;
    }
}

