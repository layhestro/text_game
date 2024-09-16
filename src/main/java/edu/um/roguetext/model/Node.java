package edu.um.roguetext.model;

import java.util.Map;

/**
 * Represents a node in the game.
 * A node has an id, text, and options.
 * The id is used to identify the node.
 * The text is the content of the node.
 * The options are the choices available to the player.
 * The options are represented as a map where the key is the choice and the value is the id of the next node.
 */
public class Node {
    private final int id;
    private final String text;
    private final Map<String, Integer> options;

    public Node(int id, String text, Map<String, Integer> options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Map<String, Integer> getOptions() {
        return options;
    }
}