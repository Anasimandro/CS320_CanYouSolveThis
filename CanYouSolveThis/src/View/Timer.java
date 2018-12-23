package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends javax.swing.Timer{
    private JPanel panel;
    private JLabel timeLabel;
    private int secondsRemaining; //Time to answer questions.

    public Timer(int delay, ClockListener cl){
        super(delay, cl);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        this.secondsRemaining = 600;

        timeLabel = new JLabel();

        panel.add(timeLabel, BorderLayout.CENTER);

    }
    private class ClockListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            timeLabel.setText(String.valueOf(secondsRemaining));
            secondsRemaining--;
        }
    }
}
