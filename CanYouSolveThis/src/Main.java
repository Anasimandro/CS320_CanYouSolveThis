import Controller.GameController;
import Model.*;
import javax.swing.*;

import View.*;

import java.awt.*;
import java.io.IOException;

public class Main {

    /*
    static Game game;

    static {
        try {
            game = new Game();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {

        try {
            Game model = new Game();

            GameController controller = new GameController(model);
            GameView view = new GameView(model, controller);
        } catch (IOException e) { e.printStackTrace(); }


        /* try {
            game.play();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    private void startGame() {
        //TODO
    }
}