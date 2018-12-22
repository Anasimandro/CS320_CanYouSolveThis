
import javax.swing.*;

import Controller.GameController;
import Model.Game;
import View.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

       startGame();

    }

    public static void startGame() {
        Game model = new Game();
        GameController controller = new GameController(model);
        GameView view = new GameView(model, controller);
    }
}