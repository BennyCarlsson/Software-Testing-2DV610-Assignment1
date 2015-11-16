package game;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameBoardTest {

	@Test
	public void testCreateGameBoard() {
		GameBoard gameBoard = new GameBoard();
		assertTrue(gameBoard.BoardArray.length == 9);
		for(BoardState boardStatus : gameBoard.BoardArray){
			assertTrue(boardStatus == BoardState.EMPTY);
		}
	}

}
