package View;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Controller.GameController;
import Model.*;


public class GamePanel extends JPanel {

    private Game model;
    private String category;
    private JPanel gamePanel;
    private GameController controller;
    // TODO private String[] answers = {controller.getCurrentAns1(), controller.getCurrentAns2(), controller.getCurrentAns3(), controller.getCurrentAns4()};
    private String[] answers = {"xd","xdz","darlanboi","Jemboi"};

    public GamePanel(String category) {

        this.category = category;
        shuffleAnswers(answers);
        createGamePanel();

    }

    private void createGamePanel() {

        gamePanel = new JPanel();
        gamePanel.setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel();
        JPanel timerPanel = new JPanel();
        JPanel statusBar = new JPanel();
        JPanel jokersPanel = new JPanel();
        JPanel scorePanel = new JPanel();


        //Implementation of the GamePanel
        questionPanel.setLayout(new BorderLayout());
        JPanel answerPanel = new JPanel();
        answerPanel.setLayout(new GridLayout(2,2));

        JButton ans1 = new JButton();
        ans1.setText(answers[0]);
        answerPanel.add(ans1);

        JButton ans2 = new JButton();
        ans2.setText(answers[1]);
        answerPanel.add(ans2);

        JButton ans3 = new JButton();
        ans3.setText(answers[2]);
        answerPanel.add(ans3);

        JButton ans4 = new JButton();
        ans4.setText(answers[3]);
        answerPanel.add(ans4);

        JLabel question = new JLabel();
        // TODO question.setText(controller.getCurrentQuestion());
        question.setText("DENEME?");


        questionPanel.add(question, BorderLayout.NORTH);
        questionPanel.add(answerPanel, BorderLayout.CENTER);











        gamePanel.add(questionPanel, BorderLayout.CENTER);
        gamePanel.add(statusBar, BorderLayout.EAST);
        gamePanel.add(timerPanel, BorderLayout.NORTH);
        gamePanel.add(jokersPanel, BorderLayout.WEST);
        gamePanel.add(scorePanel, BorderLayout.SOUTH);
    }

    private void shuffleAnswers(String[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }


    public JPanel getGamePanel() {
        return gamePanel;
    }
}
