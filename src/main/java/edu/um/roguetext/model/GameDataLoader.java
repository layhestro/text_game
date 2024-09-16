package edu.um.roguetext.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;


public class GameDataLoader {
    
    /**
     * Loads game data from a JSON file located in the resources directory.
     * 
     * @param filename the name of the JSON file
     * @return the content of the JSON file as a String
     * @throws IOException if the file is not found or cannot be read
     */
    public static String loadGameData(String filename) throws IOException {
        String resourcePath = "/edu/um/roguetext/data/" + filename;
        try (InputStream inputStream = GameDataLoader.class.getResourceAsStream(resourcePath);
            Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {

            if (inputStream == null) {
                throw new IOException("Resource not found: " + resourcePath);
            }

            return scanner.useDelimiter("\\A").next();
        }
    }

}