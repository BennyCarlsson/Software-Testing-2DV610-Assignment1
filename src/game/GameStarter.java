package game;

import java.util.Scanner;

public class GameStarter {
	GameBoard gameBoard;
	GameRules gameRules;
	Player player1;
	Player player2;
	Player playerStarted;
	Player playerTurn;
	GameOption gameOption = GameOption.TWOPLAYER;
	public static void main(String[] args) {
		GameStarter gameStarter = new GameStarter();
		gameStarter.startGame();
	}
	public void setGameRules(GameRules gameRules){
		if(this.gameRules == null){
			this.gameRules = gameRules;
		}
	}
	public void startGame(){
		gameBoard = new GameBoard();
		//setGameRules(new GameRules());
		player1 = new Player();
		player2 = new Player();
		playerStarted = player1;
		
		if(playerTurn == null || playerTurn == player1){
			playerTurn = player1;
		}else{
			playerTurn = player2;
		}
		gameOption = gameRules.chooseGameOption();
		//Call chooseGameOption
		//Set PlayMode or exit
		runGame();
	}
	public void runGame(){
		
		//while loop
			//DisplayBoard
			//playTurn()
			//if Winner/Tie
				//play again?
	}
	public void playTurn(){
		//while
			//Ask Player 1/2 input
			// if legalInput
				//convertInputToBoardPosition
			// ifcanPlay
				//editBoard
				//return
	}
}
