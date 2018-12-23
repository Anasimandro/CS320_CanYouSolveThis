package Controller;

import Model.Game;
import View.*;
import org.omg.CORBA.Object;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private Game model;
    private GameView view;

    public GameController(Game model) {
        this.model = model;

    }

    public void setView(GameView view) { this.view = view; }

    }



