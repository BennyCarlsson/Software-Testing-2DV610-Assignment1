package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GameBoardTest {
	GameBoard _gameBoard;
	@Before
	public void setUp() throws Exception {
		_gameBoard = new GameBoard();
	}
	@Test
	public void testCreateGameBoard() {
		GameBoard gameBoard = new GameBoard();
		assertTrue(gameBoard.boardArray.length == 9);
		for(BoardState boardStatus : gameBoard.boardArray){
			assertTrue(boardStatus == BoardState.EMPTY);
		}
	}
	
	@Test
	public void testDisplayBoardOnInstansiate(){
		GameBoard gameBoard = new GameBoard();
		StringWriter output = new StringWriter();
		gameBoard.displayBoard(new PrintWriter(output));
		String expected = ""
				+ "    A   B   C "
				+ "\n"
				+ "\n1     |   |  "
				+ "\n   -----------"
				+ "\n2     |   |  "
				+ "\n   -----------"
				+ "\n3     |   |  ";
		assertEquals(expected.replaceAll("\r\n", ""),output.toString().replaceAll("\r\n", ""));
	}
	@Test
	public void testConvertingEnumToString(){
		String result1 = _gameBoard.convertBoardStateToString(BoardState.EMPTY);
		String result2 = _gameBoard.convertBoardStateToString(BoardState.X);
		String result3 = _gameBoard.convertBoardStateToString(BoardState.O);
		assertEquals(" ", result1);
		assertEquals("X", result2);
		assertEquals("O", result3);
	}
	@Test
	public void testEditGameBoard(){
		GameBoard gameBoard = new GameBoard();
		gameBoard.editBoard(3,BoardState.X);
		assertEquals(gameBoard.boardArray[3], BoardState.X);
	}
}





