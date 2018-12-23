package Controller;

import Model.Game;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameController {

    private Game model;
    private GameView view;

    public GameController(Game model) throws IOException {
        this.model = model;


    }

    public void setView(GameView view) { this.view = view; }

    public String[] givePreviousScores() throws IOException {

            return model.getPreviousScores();

    }

    public String getCurrentQuestion() {

        return model.getCurrentQuestion()[0];
    }

    public String getCurrentAns1() {

        return model.getCurrentQuestion()[1];
    }

    public String getCurrentAns2() {

        return model.getCurrentQuestion()[2];
    }
    public String getCurrentAns3() {

        return model.getCurrentQuestion()[3];
    }
    public String getCurrentAns4() {

        return model.getCurrentQuestion()[4];
    }

}



