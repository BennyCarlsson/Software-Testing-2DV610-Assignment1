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
		isBoardStateSame(BoardState.X,BoardState.EMPTY,BoardState.O);
		isBoardStateSame(BoardState.EMPTY,BoardState.O,BoardState.X);
		isBoardStateSame(BoardState.O,BoardState.X,BoardState.EMPTY);
		isBoardStateSame(BoardState.X,BoardState.EMPTY,BoardState.O);
		isBoardStateSame(BoardState.EMPTY,BoardState.O,BoardState.X);
		isBoardStateSame(BoardState.O,BoardState.X,BoardState.EMPTY);
		isBoardStateSame(BoardState.X,BoardState.O,BoardState.EMPTY);
		isBoardStateSame(BoardState.O,BoardState.O,BoardState.O);
		return false;
	}
	public boolean isBoardStateSame(BoardState bs1,BoardState bs2, BoardState bs3){
		
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
