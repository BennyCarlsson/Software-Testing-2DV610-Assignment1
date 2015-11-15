package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.*;

public class GameStarterTest {

	@Test
	public void testChooseGameOption() {
		GameStarter gameStarter = new GameStarter();
		StringWriter output = new StringWriter();
		String input = "1\n";
		GameOption gameOption = gameStarter.chooseGameOption(new Scanner(input),new PrintWriter(output));
		assertEquals(GameOption.ONEPLAYER, gameOption);
	}

}
