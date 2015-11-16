package game;

import java.io.PrintWriter;

public class GameBoard {
	BoardState[] boardArray;
	public GameBoard(){
		boardArray = new BoardState[9];
		for(int i = 0; i < boardArray.length; i++){
			boardArray[i] = BoardState.EMPTY;
		}
	}
	public void displayBoard(){
		displayBoard(new PrintWriter(System.out,true));
	}
	public void displayBoard(PrintWriter output){
		output.println(""
				+ "    A   B   C "
				+ "\n"
				+ "\n1     |   |  "
				+ "\n   -----------"
				+ "\n2     |   |  "
				+ "\n   -----------"
				+ "\n3     |   |  ");
	}
	public String ConvertBoardStateToString(BoardState boardState){
		switch (boardState) {
		case EMPTY: return " ";
		case X: return "X";
		case O: return "O";
		default:
			return null;
		}
	}
}
