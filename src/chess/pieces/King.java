package chess.pieces;

import boardgame.Board;
import chass.ChessPiece;
import chass.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
