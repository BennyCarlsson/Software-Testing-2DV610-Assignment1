package game;

import java.io.PrintWriter;
import java.util.Scanner;

public class GameStarter {
	GameBoard gameBoard;
	GameRules gameRules;
	Player player1;
	Player player2;
	Player playerStarted;
	Player playerTurn;
	public static void main(String[] args) {
		GameStarter gameStarter = new GameStarter();
		gameStarter.startGame();
	}
	public void startGame(){
		gameBoard = new GameBoard();
		gameRules = new GameRules();
		player1 = new Player();
		player2 = new Player();
		playerStarted = player1;
		
		if(playerTurn == null || playerTurn == player1){
			playerTurn = player1;
		}else{
			playerTurn = player2;
		}
		runGame();
	}
	public void runGame(){
		//Call chooseGameOption
		//Set PlayMode or exit
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
