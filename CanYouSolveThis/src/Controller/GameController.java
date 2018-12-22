package Controller;

import Model.Game;
import View.*;

public class GameController {

    private Game model;
    private GameView view;


    public GameController(Game model) {
        this.model = model;

    }

    public void setView(GameView view) { this.view = view; }



}
