package game.board;

import game.pieces.Piece;

public class Tile {
    private int id;
    private Piece piece;
    private boolean occupied;

    Tile(int id) {
        new Tile(id, null);
    }

    Tile(int id, Piece piece) {
        this.id = id;
        this.piece = piece;
        this.occupied = piece != null;
    }

    public int id() {
        return id;
    }

    public Piece piece() {
        return piece;
    }

    public boolean occupied() {
        return occupied;
    }
}
