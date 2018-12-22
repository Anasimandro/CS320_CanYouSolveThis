package Controller;

import Model.Game;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class GameController {

    private Game model;
    private GameView view;

    public GameController(Game model) {
        this.model = model;

    }

    public void setView(GameView view) { this.view = view; }

    public void pressExit() {

        view.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.gameFrame.dispatchEvent(new WindowEvent(view.gameFrame, WindowEvent.WINDOW_CLOSING));
            }
        });


    }




}
