import Model.*;
import javax.swing.*;

import View.*;

import java.awt.*;
import java.io.IOException;

public class Main {
static Game game;

    static {
        try {
            game = new Game();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       /*JFrame frame = new JFrame("Can You Solve This");
        frame.setSize(1200, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StatusBar startScreen = new StatusBar();
        JPanel startPanel = startScreen.getPanel();

        frame.add(startPanel);

        startPanel.setVisible(true);1

        frame.setVisible(true);*/

        try {
            game.play();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void startNewGame() {
        //TODO
    }
}