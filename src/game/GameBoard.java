package game;

public class GameBoard {
	BoardState[] boardArray;
	public GameBoard(){
		boardArray = new BoardState[9];
		for(int i = 0; i < boardArray.length; i++){
			boardArray[i] = BoardState.EMPTY;
		}
	}
}
