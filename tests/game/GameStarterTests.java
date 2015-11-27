package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class GameStarterTests {

	@Test
	public void startGame(){
		GameStarter gameStarter = new GameStarter();
		gameStarter.startGame();
		assertNotNull(gameStarter.gameBoard);
		assertNotNull(gameStarter.player1);
		assertNotNull(gameStarter.player2);
		assertNotNull(gameStarter.gameRules);
		assertSame(gameStarter.player1, gameStarter.playerStarted);
		assertSame(gameStarter.player1, gameStarter.playerTurn);
	}

}
