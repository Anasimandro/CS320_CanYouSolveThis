package View;

import javax.swing.*;
import java.awt.*;

public class StatusBar {
    private JPanel panel;

    public StatusBar() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label1 = new JLabel("------");
        label1.setSize(100, 50);
        label1.setLocation(100, 500);
        label1.setBackground(Color.DARK_GRAY);
        panel.add(label1);

        JLabel label2 = new JLabel("------");
        label2.setSize(100, 50);
        label2.setLocation(200, 500);
        label2.setBackground(Color.DARK_GRAY);
        panel.add(label2);

        JLabel label3 = new JLabel("------");
        label3.setSize(100, 50);
        label3.setLocation(300, 500);
        label3.setBackground(Color.DARK_GRAY);
        panel.add(label3);

        JLabel label4 = new JLabel("------");
        label4.setSize(100, 50);
        label4.setLocation(400, 500);
        label4.setBackground(Color.DARK_GRAY);
        panel.add(label4);

        JLabel label5 = new JLabel("------");
        label5.setSize(100, 50);
        label5.setLocation(500, 500);
        label5.setBackground(Color.DARK_GRAY);
        panel.add(label5);

        JLabel label6 = new JLabel("------");
        label6.setSize(100, 50);
        label6.setLocation(600, 500);
        label6.setBackground(Color.DARK_GRAY);
        panel.add(label6);

        JLabel label7 = new JLabel("------");
        label7.setSize(100, 50);
        label7.setLocation(700, 500);
        label7.setBackground(Color.green);
        panel.add(label7);

        JLabel label8 = new JLabel("------");
        label8.setSize(100, 50);
        label8.setLocation(800, 500);
        label8.setBackground(Color.DARK_GRAY);
        panel.add(label8);

        JLabel label9 = new JLabel("------");
        label9.setSize(100, 50);
        label9.setLocation(900, 500);
        label9.setBackground(Color.DARK_GRAY);
        panel.add(label9);

        JLabel label10 = new JLabel("------");
        label10.setSize(100, 50);
        label10.setLocation(1000, 500);
        label10.setBackground(Color.DARK_GRAY);
        panel.add(label10);

    }

    public JPanel getPanel() {
        return panel;
    }
}
