package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends javax.swing.Timer{
    private JLabel timeLabel;
    private int initialTime; //Time to answer questions.
    private int counter; //timeListener

    public Timer(int delay, TimeListener timeListener){
        super(delay, timeListener);
        this.initialTime = 600;
        super.start();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        timeLabel = new JLabel();

        panel.add(timeLabel, BorderLayout.CENTER);
    }
    private class TimeListener implements ActionListener {
        int secondsRemaining;

        public void actionPerformed(ActionEvent e) {
            secondsRemaining = initialTime-counter;
            timeLabel.setText("Time remaining : " + secondsRemaining + "seconds");

            if (OutOfTime()) {
                Timer.super.stop();
            }
        }
        private boolean OutOfTime(){
            return (++counter > initialTime);
        }
    }
}
