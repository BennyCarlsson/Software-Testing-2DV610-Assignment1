package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Ignore;
import org.junit.Test;

public class GameBoardTest {

	@Ignore@Test
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
}
