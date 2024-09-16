package edu.um.roguetext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Entry point for the JavaFX application.
 */
public class Game extends Application {

    private static Scene scene;

    // This method is called when the JavaFX application is started, overriding the start method in the Application class
    // The start method is the entry point for the JavaFX application
    // The stage is the top-level container for the JavaFX application
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = loadFXML("score");
        scene = new Scene(root, 640, 480);
        stage.setTitle("RogueText");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource("fxml/" + fxml + ".fxml"));
        return fxmlLoader.load(); 
    }

    public static void main(String[] args) {
        // This is the entry point for the JavaFX application and it launches the JavaFX application
        launch();
    }

}