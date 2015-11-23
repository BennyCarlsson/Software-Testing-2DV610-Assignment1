package game;

import java.util.ArrayList;
import java.util.Arrays;

public class GameRules {
	String[] spotZero = new String[]{"1","1a","a1"};
	String[] spotOne = new String[]{"2","2a","a2"};
	String[] spotTwo = new String[]{"3","3a","a3"};
	String[] spotThree = new String[]{"4","1b","b1"};
	String[] spotFour = new String[]{"5","2b","b2"};
	String[] spotFive = new String[]{"6","3b","b3"};
	String[] spotSix = new String[]{"7","1c","c1"};
	String[] spotSeven = new String[]{"8","2c","c2"};
	String[] spotEight = new String[]{"9","3c","c3"};
	
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
		if(isBoardStateSame(boardArray[0], boardArray[1], boardArray[2])
		|| isBoardStateSame(boardArray[3], boardArray[4], boardArray[5])
		|| isBoardStateSame(boardArray[6], boardArray[7], boardArray[8])
		|| isBoardStateSame(boardArray[0], boardArray[3], boardArray[6])
		|| isBoardStateSame(boardArray[1], boardArray[4], boardArray[5])
		|| isBoardStateSame(boardArray[2], boardArray[5], boardArray[8])
		|| isBoardStateSame(boardArray[0], boardArray[4], boardArray[8])
		|| isBoardStateSame(boardArray[2], boardArray[4], boardArray[6])){
			return true;
		}
		return false;
	}
	public boolean isBoardStateSame(BoardState bs1,BoardState bs2, BoardState bs3){
		if(bs1 != BoardState.EMPTY || bs2 != BoardState.EMPTY || bs3 != BoardState.EMPTY){
			if(bs1 == bs2 && bs2 == bs3){
				return true;
			}
		}
		return false;
	}
	public boolean checkTie(BoardState[] boardArray){
		if(!checkWinner(boardArray)){
			if(Arrays.asList(boardArray).contains(BoardState.EMPTY)){
				return false;
			}
			//all spots are used and no one won
			return true;
		}
		return false;
	}
	public int convertInputToBoardPosition(String input){
		input = input.toLowerCase();
		if(Arrays.asList(spotZero).contains(input)){
			return 0;
		}else if(Arrays.asList(spotOne).contains(input)){
			return 1;
		}else if(Arrays.asList(spotTwo).contains(input)){
			return 2;
		}else if(Arrays.asList(spotThree).contains(input)){
			return 3;
		}else if(Arrays.asList(spotFour).contains(input)){
			return 4;
		}else if(Arrays.asList(spotFive).contains(input)){
			return 5;
		}else if(Arrays.asList(spotSix).contains(input)){
			return 6;
		}else if(Arrays.asList(spotSeven).contains(input)){
			return 7;
		}else if(Arrays.asList(spotEight).contains(input)){
			return 8;
		}
		return -1;
	}
	public boolean legalInput(String input){
		input = input.toLowerCase();
		if(Arrays.asList(spotZero).contains(input)
		|| Arrays.asList(spotOne).contains(input)
		|| Arrays.asList(spotTwo).contains(input)
		|| Arrays.asList(spotThree).contains(input)
		|| Arrays.asList(spotFour).contains(input)
		|| Arrays.asList(spotFive).contains(input)
		|| Arrays.asList(spotSix).contains(input)
		|| Arrays.asList(spotSeven).contains(input)
		|| Arrays.asList(spotEight).contains(input)){
			return true;
		}
		return false;
	}
}
