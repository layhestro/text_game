package edu.um.roguetext.model;

import java.util.*;

public class World {
    private final Node startNode;
    private Node currentNode;
    private final Player player;
    private final Map<Integer, Node> nodes;
    private List<Node> visitedNodes;

    public World(Node startNode, Player player, Map<Integer, Node> nodes) {
        this.startNode = startNode;
        this.currentNode = startNode;
        this.player = player;
        this.visitedNodes = new ArrayList<>();
        this.nodes = nodes;
    }
}
