package edu.um.roguetext.controller;

import edu.um.roguetext.Game;
import edu.um.roguetext.model.Score;
// This is used to mark fields and methods that are linked to elements in the FXML file
import javafx.fxml.FXML;
// This is used to create a label in the FXML file
import javafx.scene.control.Label;

public class ScoreController {
    private Score score;

    // This tells JavaFX that the scoreLabel in the controller class refers to a Label element in the primary.fxml file
    // JavaFX automatically looks at the primary.fxml file for a Label element with the same fx:id
    @FXML
    private Label scoreLabel;

    public ScoreController() {
        this.score = new Score();
    }

    // special lifecycle method that gets automatically called after the FXML has been loaded but before the scene is displayed
    @FXML
    private void initialize() {
        updateView();
    }

    @FXML
    public void increaseScore() {
        score.increaseScoreByOne();
        updateView();
    }

    public void updateView() {
        scoreLabel.setText("Score: " + score.getScore());
    }

    @FXML
    private void switchToTwo() {
        try {
            Game.setRoot("two");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
