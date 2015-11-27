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
		String zero = convertBoardStateToString(boardArray[0]);
		String one = convertBoardStateToString(boardArray[1]);
		String two = convertBoardStateToString(boardArray[2]);
		String three = convertBoardStateToString(boardArray[3]);
		String four = convertBoardStateToString(boardArray[4]);
		String five = convertBoardStateToString(boardArray[5]);
		String six = convertBoardStateToString(boardArray[6]);
		String seven = convertBoardStateToString(boardArray[7]);
		String eight = convertBoardStateToString(boardArray[8]);
		output.println(""
				+ "    1   2   3 "
				+ "\n"
				+ "\nA   "+zero+" | "+one+" | "+two+""
				+ "\n   -----------"
				+ "\nB   "+three+" | "+four+" | "+five+""
				+ "\n   -----------"
				+ "\nC   "+six+" | "+seven+" | "+eight+"");
	}
	public String convertBoardStateToString(BoardState boardState){
		switch (boardState) {
		case EMPTY: return " ";
		case X: return "X";
		case O: return "O";
		default:
			return null;
		}
	}
	public void editBoard(int boardSpot, BoardState boardState){
		if(boardSpot >= 0 && boardSpot <= 8){
			boardArray[boardSpot] = boardState;
		}else{
			throw new IllegalArgumentException();
		}
	}
}
