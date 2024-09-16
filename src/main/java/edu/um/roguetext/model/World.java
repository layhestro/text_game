package edu.um.roguetext.model;

import java.util.Map;

public class World {
    private final Node startNode;
    private Node currentNode;
    private final Player player;
    private final Map<Integer, Node> nodes;

    public World(Node startNode, Player player, Map<Integer, Node> nodes) {
        this.startNode = startNode;
        this.currentNode = startNode;
        this.player = player;
        this.nodes = nodes;
    }
}
