package game;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameRulesTests {
	BoardState[] boardArray;
	BoardState[] boardArrayWinner;
	BoardState[] boardArrayTie;
	
	GameRules _gameRules = new GameRules();
	@Before
	public void setUp() throws Exception {
		boardArray = new BoardState[]{
				BoardState.X,BoardState.EMPTY,BoardState.O,
				BoardState.EMPTY,BoardState.X,BoardState.X,
				BoardState.O,BoardState.EMPTY,BoardState.O};
		boardArrayWinner = new BoardState[]{
				BoardState.X,BoardState.X,BoardState.X,
				BoardState.O,BoardState.O,BoardState.X,
				BoardState.O,BoardState.X,BoardState.O};
		boardArrayTie = new BoardState[]{
				BoardState.X,BoardState.O,BoardState.X,
				BoardState.O,BoardState.O,BoardState.X,
				BoardState.O,BoardState.X,BoardState.O};
	}

	@Ignore@Test
	public void testCanPlay() {
		assertTrue(_gameRules.canPlay(boardArray, 1));
	}
	@Ignore@Test
	public void testCanNotPlay() {
		assertFalse(_gameRules.canPlay(boardArray, 2));
	}
	@Ignore@Test 
	public void testCanPlayChecksNoOneHaveWon(){
		GameRules gameRules = spy(new GameRules());
		gameRules.canPlay(boardArray, 2);
		verify(gameRules,atLeastOnce()).checkWinner(boardArray);
	}
	@Ignore@Test
	public void testCheckWinnerWithWinner(){
		assertTrue(_gameRules.checkWinner(boardArrayWinner));
	}
	@Ignore@Test
	public void testCheckWinnerUsesisBoardStateSame(){
		BoardState[] specialBoardArray = new BoardState[]{
				BoardState.X,BoardState.EMPTY,BoardState.O,
				BoardState.EMPTY,BoardState.O,BoardState.X,
				BoardState.O,BoardState.X,BoardState.EMPTY};
		
		GameRules gameRules = spy(new GameRules());
		gameRules.checkWinner(specialBoardArray);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.X,BoardState.EMPTY,BoardState.O);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.EMPTY,BoardState.O,BoardState.X);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.O,BoardState.X,BoardState.EMPTY);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.X,BoardState.EMPTY,BoardState.O);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.EMPTY,BoardState.O,BoardState.X);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.O,BoardState.X,BoardState.EMPTY);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.X,BoardState.O,BoardState.EMPTY);
		verify(gameRules,atLeastOnce()).isBoardStateSame(BoardState.O,BoardState.O,BoardState.O);
	}
	@Ignore@Test
	public void testIsBoardStateSame(){
		assertTrue(_gameRules.isBoardStateSame(BoardState.X, BoardState.X, BoardState.X));
		assertTrue(_gameRules.isBoardStateSame(BoardState.O, BoardState.O, BoardState.O));
		assertFalse(_gameRules.isBoardStateSame(BoardState.EMPTY, BoardState.EMPTY, BoardState.EMPTY));
		assertFalse(_gameRules.isBoardStateSame(BoardState.X, BoardState.O, BoardState.X));
		assertFalse(_gameRules.isBoardStateSame(BoardState.EMPTY, BoardState.X, BoardState.X));
		assertFalse(_gameRules.isBoardStateSame(BoardState.O, BoardState.O, BoardState.EMPTY));
	}
	@Ignore@Test
	public void testCheckTie(){
		assertTrue(_gameRules.checkTie(boardArrayTie));
		assertFalse(_gameRules.checkTie(boardArray));
		assertFalse(_gameRules.checkTie(boardArrayWinner));
	}
	
	@Test
	public void testConvertInputToBoardPosition(){
		assertEquals(1, _gameRules.convertInputToBoardPosition("1a"));
		assertEquals(4, _gameRules.convertInputToBoardPosition("b2"));
		assertEquals(5, _gameRules.convertInputToBoardPosition("5"));
		assertEquals(-1, _gameRules.convertInputToBoardPosition("4d"));
	}
	@Ignore@Test
	public void testLegalInput(){
		assertTrue(_gameRules.legalInput("1"));
		assertTrue(_gameRules.legalInput("2"));
		assertTrue(_gameRules.legalInput("3"));
		assertTrue(_gameRules.legalInput("4"));
		assertTrue(_gameRules.legalInput("6"));
		assertTrue(_gameRules.legalInput("7"));
		assertTrue(_gameRules.legalInput("8"));
		assertTrue(_gameRules.legalInput("a1"));
		assertTrue(_gameRules.legalInput("a2"));
		assertTrue(_gameRules.legalInput("A3"));
		assertTrue(_gameRules.legalInput("b1"));
		assertTrue(_gameRules.legalInput("B2"));
		assertTrue(_gameRules.legalInput("b3"));
		assertTrue(_gameRules.legalInput("C1"));
		assertTrue(_gameRules.legalInput("c2"));
		assertTrue(_gameRules.legalInput("c2"));
		assertTrue(_gameRules.legalInput("1A"));
		assertTrue(_gameRules.legalInput("2a"));
		assertTrue(_gameRules.legalInput("3a"));
		assertTrue(_gameRules.legalInput("1B"));
		assertTrue(_gameRules.legalInput("2b"));
		assertTrue(_gameRules.legalInput("3B"));
		assertTrue(_gameRules.legalInput("1c"));
		assertTrue(_gameRules.legalInput("2c"));
		assertTrue(_gameRules.legalInput("3C"));
		assertFalse(_gameRules.legalInput("4d"));
		assertFalse(_gameRules.legalInput("01"));
		assertFalse(_gameRules.legalInput("asd"));
	}
}
