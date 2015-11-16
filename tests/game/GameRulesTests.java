package game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GameRulesTests {
	BoardState[] boardArray;
	BoardState[] boardArrayTie;
	BoardState[] boardArrayWinner;
	BoardState[] boardArrayNoWinner;
	
	GameRules _gameRules = new GameRules();
	@Before
	public void setUp() throws Exception {
		boardArray = new BoardState[]{
				BoardState.X,BoardState.EMPTY,BoardState.O,
				BoardState.EMPTY,BoardState.X,BoardState.X,
				BoardState.O,BoardState.EMPTY,BoardState.O};
	}

	@Test
	public void testCanPlay() {
		assertTrue(_gameRules.canPlay(boardArray, 1));
	}
	@Test
	public void testCanNotPlay() {
		assertFalse(_gameRules.canPlay(boardArray, 2));
	}
	@Ignore@Test
	public void testCheckWinnerNoWinner(){
		
	}
	@Ignore@Test
	public void testCheckWinnerWithWinner(){
		
	}
	@Ignore@Test
	public void testTieWithTie(){
		
	}
	@Ignore@Test
	public void testTieNoTie(){
		
	}
	@Ignore@Test
	public void testConvertInputToBoardPosition(){
		
	}
	@Ignore@Test
	public void testLegalInput(){
		
	}
	@Ignore@Test
	public void testIllegalInput(){
		
	}
}
