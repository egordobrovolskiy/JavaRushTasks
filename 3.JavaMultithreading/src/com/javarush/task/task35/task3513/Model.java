package com.javarush.task.task35.task3513;

import java.util.ArrayList;

public class Model {
    private  static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    public int score;
    public int maxTile;

    public Model () {
        resetGameTiles();
    }

    private void addTile() {
        ArrayList<Tile> emptyTiles = getEmptyTiles();
        if (emptyTiles != null && emptyTiles.size() != 0) {
            Tile emptyTile = emptyTiles.get((int) (emptyTiles.size()*Math.random()));
            emptyTile.setValue(Math.random() < 0.9 ? 2 : 4);
        }
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
        score = 0;
        maxTile = 2;
        addTile();
        addTile();
    }

    private boolean compressTiles(Tile[] tiles){
        boolean change = false;
        for (int k = 0; k < tiles.length - 1; k++) {
            for (int i = 0; i < tiles.length - 1; i++) {
                if (tiles[i].isEmpty() && !tiles[i+1].isEmpty()) {
                    change = true;
                    tiles[i] = tiles[i+1];
                    tiles[i+1] = new Tile();
                }
            }
        }
        return change;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean change = false;
        for (int i = 0; i < tiles.length -1; i++) {
            if (tiles[i].getValue() == tiles[i+1].getValue() && !tiles[i].isEmpty() && !tiles[i + 1].isEmpty()) {
                tiles[i].setValue(tiles[i].getValue() * 2);
                tiles[i + 1] = new Tile();
                change = true;
                maxTile = maxTile > tiles[i].getValue() ? maxTile : tiles[i].getValue();
                score += tiles[i].getValue();

            }
            compressTiles(tiles);
        }
        return change;
    }

    public void left() {
        boolean isChanged = false;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            if (compressTiles(gameTiles[i]) | mergeTiles(gameTiles[i])) {
                isChanged = true;
            }
        }
        if (isChanged) {
            addTile();
        }
    }

    private void rotateToRight() {
        Tile tmp;
        for (int i = 0; i < FIELD_WIDTH / 2; i++) {
            for (int j = i; j < FIELD_WIDTH - 1 - i; j++) {
                tmp = gameTiles[i][j];
                gameTiles[i][j] = gameTiles[FIELD_WIDTH-j-1][i];
                gameTiles[FIELD_WIDTH-j-1][i] = gameTiles[FIELD_WIDTH-i-1][FIELD_WIDTH-j-1];
                gameTiles[FIELD_WIDTH-i-1][FIELD_WIDTH-j-1] = gameTiles[j][FIELD_WIDTH-i-1];
                gameTiles[j][FIELD_WIDTH-i-1] = tmp;
            }
        }
    }

    void right() {
        rotateToRight();
        rotateToRight();
        left();
        rotateToRight();
        rotateToRight();
    }
    void up() {
        rotateToRight();
        rotateToRight();
        rotateToRight();
        left();
        rotateToRight();
    }
    void down() {
        rotateToRight();
        left();
        rotateToRight();
        rotateToRight();
        rotateToRight();
    }

    public boolean canMove() {
        if(!getEmptyTiles().isEmpty()) return true;

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[i][j].getValue() == gameTiles[i][j-1].getValue())
                    return true;
            }
        }
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[j][i].getValue() == gameTiles[j-1][i].getValue())
                    return true;
            }
        }
        return false;
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    public int getScore() {
        return score;
    }
}

