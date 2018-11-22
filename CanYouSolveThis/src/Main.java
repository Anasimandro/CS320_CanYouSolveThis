
import javax.swing.*;
import View.*;

import java.awt.*;

public class Main {

    public static void main(String[]args){
        JFrame frame=new JFrame("Can You Solve This");
        frame.setSize(1200, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StartScreen startScreen=new StartScreen();
        JPanel startPanel = startScreen.getPanel();

        frame.add(startPanel);
        frame.add(startPanel);

        startPanel.setVisible(true);
        frame.setVisible(true);
    }
    private void startNewGame() {
        //TODO
    }
}