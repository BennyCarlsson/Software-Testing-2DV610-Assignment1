package game;

public class GameRules {
	
	public boolean canPlay(BoardState[] boardArray,int boardPosition){
		if(checkWinner(boardArray)){
			return false;
		}
		if(boardArray[boardPosition] == BoardState.EMPTY){
			return true;
		}
		return false;
	}
	public boolean checkWinner(BoardState[] boardArray){
		return true;
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
