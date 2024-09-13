package edu.um.roguetext.controller;

import javafx.fxml.FXML;
import edu.um.roguetext.Game;

public class TwoController {
    @FXML
    private void switchToScore() {
        try {
            Game.setRoot("score");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
