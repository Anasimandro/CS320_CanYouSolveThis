package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends javax.swing.Timer{
    private JPanel panel;
    private JLabel timeLabel;
    int N = 60;
    public Timer(int time, ClockListener cl){
        super(time, cl);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        timeLabel = new JLabel();

        panel.add(timeLabel);

    }
    private class ClockListener implements ActionListener {

        private int count;

        public void actionPerformed(ActionEvent e) {
            count %= N;
            timeLabel.setText(String.valueOf(count));
            count++;
        }
    }
}
