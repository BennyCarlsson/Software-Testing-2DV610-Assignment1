package game;

public class GameRules {
	
	public boolean canPlay(BoardState[] boardArray,int boardPosition){
		checkWinner(boardArray);
		if(boardArray[boardPosition] == BoardState.EMPTY){
			return true;
		}
		return false;
	}
	public boolean checkWinner(BoardState[] boardArray){
		return false;
	}
	public boolean checkTie(BoardState[] boardArray){
		return false;
	}
	public int convertInputToBoardPosition(String input){
		return 0;
	}
	public boolean legalInput(String input){
		return false;
	}
}
