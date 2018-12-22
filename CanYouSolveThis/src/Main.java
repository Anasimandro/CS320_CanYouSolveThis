import Model.*;
import javax.swing.*;

import View.*;

import java.awt.*;

public class Main {
static Game game = new Game();

    public static void main(String[] args) {
       JFrame frame = new JFrame("Can You Solve This");
        frame.setSize(1200, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StatusBar startScreen = new StatusBar();
        JPanel startPanel = startScreen.getPanel();

        frame.add(startPanel);

        startPanel.setVisible(true);1

        frame.setVisible(true);



    }

    private void startNewGame() {
        //TODO
    }
}