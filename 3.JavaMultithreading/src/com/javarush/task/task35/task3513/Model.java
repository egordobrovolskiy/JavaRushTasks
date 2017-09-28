package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private  static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model () {
        resetGameTiles();
    }

    private void addTile() {
        ArrayList<Tile> emptyTiles = getEmptyTiles();
        Tile emptyTile = emptyTiles.get((int) (emptyTiles.size()*Math.random()));
        emptyTile.setValue(Math.random() < 0.9 ? 2 : 4);
    }

    private ArrayList<Tile> getEmptyTiles() {
        ArrayList<Tile> arrayTile = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int k = 0; k < gameTiles.length; k++) {
                if (gameTiles[i][k].isEmpty()) {
                    arrayTile.add(gameTiles[i][k]);
                }
            }
        }
        return arrayTile;
    }

    public void resetGameTiles() {
        this.gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int k = 0; k < gameTiles.length; k++) {
                gameTiles[i][k] = new Tile();
            }
        }
        addTile();
        addTile();
    }

}
