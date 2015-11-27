package game;

import java.io.PrintWriter;
import java.util.Scanner;

public class GameStarter {
	GameBoard gameBoard;
	Player player1;
	Player player2;
	GameRules gameRules;
	Player playerStarted;
	Player playerTurn;
	public static void main(String[] args) {
		GameStarter gameStarter = new GameStarter();
		gameStarter.startGame();
	}
	public void startGame(){
		//Instansiate GameBoard
		//Instansiate Player1
		//Instansiate Player2
		//Instansiate GameRules
		//runGame();
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
