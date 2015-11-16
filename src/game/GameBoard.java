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
		String zero = ConvertBoardStateToString(boardArray[0]);
		String one = ConvertBoardStateToString(boardArray[1]);
		String two = ConvertBoardStateToString(boardArray[2]);
		String three = ConvertBoardStateToString(boardArray[3]);
		String four = ConvertBoardStateToString(boardArray[4]);
		String five = ConvertBoardStateToString(boardArray[5]);
		String six = ConvertBoardStateToString(boardArray[6]);
		String seven = ConvertBoardStateToString(boardArray[7]);
		String eight = ConvertBoardStateToString(boardArray[8]);
		output.println(""
				+ "    A   B   C "
				+ "\n"
				+ "\n1   "+zero+" | "+one+" | "+two+""
				+ "\n   -----------"
				+ "\n2   "+three+" | "+four+" | "+five+""
				+ "\n   -----------"
				+ "\n3   "+six+" | "+seven+" | "+eight+"");
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
