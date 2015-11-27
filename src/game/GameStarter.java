package game;

import java.io.InputStream;
import java.util.Scanner;

public class GameStarter {
	GameBoard gameBoard;
	GameRules gameRules;
	Player player1;
	Player player2;
	Player playerStarted;
	Player playerTurn;
	GameOption gameOption;
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
		setGameRules(new GameRules());
		player1 = new Player();
		player2 = new Player();
		
		if(playerStarted == null || playerStarted == player2){
			playerStarted = player1;
		}else{
			playerStarted = player2;
		}
		
		if(playerTurn == null || playerTurn == player2){
			playerTurn = player1;
		}else{
			playerTurn = player2;
		}
		
		gameOption = gameRules.chooseGameOption();
		switch(this.gameOption){
		case ONEPLAYER: System.out.println("This Option Is not created yet");
			break;
		case TWOPLAYER: 
			gameOption = GameOption.TWOPLAYER;
			runGame();
			break;
		case QUIT: System.out.println("Bye Bye");
			break;
		}
	}
	public void runGame(){
		while(true){
			gameBoard.displayBoard();
			playTurn();
			if(gameRules.checkWinner(gameBoard.boardArray)){
				gameBoard.displayBoard();
				if(playerTurn == player1){
					System.out.print("Player1 Won!");
				}else{
					System.out.print("Player2 Won!");
				}
				break;
			}else if(gameRules.checkTie(gameBoard.boardArray)){
				gameBoard.displayBoard();
				System.out.print("Tie! No winner");
				break;
			}
		}
		playAgain();
	}
	public void playAgain(){

		
	}
	public void playTurn(){

	}
}