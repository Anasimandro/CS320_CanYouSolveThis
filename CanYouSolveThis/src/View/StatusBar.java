package View;

import javax.swing.*;
import java.awt.*;

public class StatusBar {
    private JPanel panel;

    public StatusBar() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label1 = new JLabel("");
        label1.setSize(95, 20);
        label1.setLocation(100, 550);
        label1.setBackground(Color.green);
        label1.setOpaque(true);
        panel.add(label1);

        JLabel label2 = new JLabel("");
        label2.setSize(95, 20);
        label2.setLocation(200, 550);
        label2.setBackground(Color.green);
        label2.setOpaque(true);
        panel.add(label2);

        JLabel label3 = new JLabel("");
        label3.setSize(95, 20);
        label3.setLocation(300, 550);
        label3.setBackground(Color.green);
        label3.setOpaque(true);
        panel.add(label3);

        JLabel label4 = new JLabel("");
        label4.setSize(95, 20);
        label4.setLocation(400, 550);
        label4.setBackground(Color.DARK_GRAY);
        label4.setOpaque(true);
        panel.add(label4);

        JLabel label5 = new JLabel("");
        label5.setSize(95, 20);
        label5.setLocation(500, 550);
        label5.setBackground(Color.DARK_GRAY);
        label5.setOpaque(true);
        panel.add(label5);

        JLabel label6 = new JLabel("");
        label6.setSize(95, 20);
        label6.setLocation(600, 550);
        label6.setBackground(Color.DARK_GRAY);
        label6.setOpaque(true);
        panel.add(label6);

        JLabel label7 = new JLabel("");
        label7.setSize(95, 20);
        label7.setLocation(700, 550);
        label7.setBackground(Color.DARK_GRAY);
        label7.setOpaque(true);
        panel.add(label7);

        JLabel label8 = new JLabel("");
        label8.setSize(95, 20);
        label8.setLocation(800, 550);
        label8.setBackground(Color.DARK_GRAY);
        label8.setOpaque(true);
        panel.add(label8);

        JLabel label9 = new JLabel("");
        label9.setSize(95, 20);
        label9.setLocation(900, 550);
        label9.setBackground(Color.DARK_GRAY);
        label9.setOpaque(true);
        panel.add(label9);

        JLabel label10 = new JLabel("");
        label10.setSize(95, 20);
        label10.setLocation(1000, 550);
        label10.setBackground(Color.DARK_GRAY);
        label10.setOpaque(true);
        panel.add(label10);



    }

    public JPanel getPanel() {
        return panel;
    }
}
