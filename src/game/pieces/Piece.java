package game.pieces;

import game.board.Board;
import game.player.Move;
import game.player.Teams;

import java.util.List;

public abstract class Piece {
    protected Teams team;
    protected int location;

    Piece(Teams team, int location) {
        this.team = team;
        this.location = location;
    }

    public abstract List<Move> possibleMoves(Board board);
}
