package View;

import javax.swing.*;
import java.awt.*;

public class StatusBar {
    private JPanel panel;

    public StatusBar() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel();
        label.setSize(100, 50);
        label.setLocation(100, 500);
    }

    public JPanel getPanel() {
        return panel;
    }
}
