package edu.um.roguetext.model;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Item> currentItems;
    private int maxSize;
    private int currentSize;

    public Inventory() {
        this.maxSize = 10;
        this.currentItems = new ArrayList<>();
        this.currentSize = 0;
    }
}
