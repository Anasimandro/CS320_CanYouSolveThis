package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends javax.swing.Timer{
    private JPanel panel;
    private JLabel timeLabel;
    private int initialTime; //Time to answer questions.

    public Timer(){
        super(1000, null); //Timer super constructor takes a delay and actionlistener
        super.addActionListener(new TimeListener());
        this.initialTime = 600;

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        timeLabel = new JLabel();
        panel.add(timeLabel, BorderLayout.CENTER);

        super.start();
    }

    public JPanel getPanel() {
        return panel;
    }
    public JLabel getTimeLabel(){
        return timeLabel;
    }
    public int getInitialTime(){
        return initialTime;
    }

    private class TimeListener implements ActionListener {
        int secondsRemaining;
        int counter;

        public void actionPerformed(ActionEvent e) {
            secondsRemaining = getInitialTime()- counter;
            getTimeLabel().setText("Time remaining : " + secondsRemaining + "seconds");

            if (OutOfTime()) {
                Timer.super.stop();
            }
        }
        private boolean OutOfTime(){
            return (++counter > getInitialTime());
        }
    }
}
