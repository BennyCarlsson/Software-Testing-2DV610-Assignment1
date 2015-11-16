package game;

public class GameBoard {
	BoardState[] BoardArray;
	public GameBoard(){
		BoardArray = new BoardState[]{BoardState.EMPTY,BoardState.EMPTY,
									BoardState.EMPTY,BoardState.EMPTY,BoardState.EMPTY,
									BoardState.EMPTY,BoardState.EMPTY,BoardState.EMPTY,
									BoardState.EMPTY};
	}
}
