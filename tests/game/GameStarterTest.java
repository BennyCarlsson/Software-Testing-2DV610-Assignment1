package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class GameStarterTest {

	@Test
	public void testChooseLegalGameOption() {
		GameStarter gameStarter = new GameStarter();
		StringWriter output = new StringWriter();
		String input = "1";
		GameOption gameOption = gameStarter.chooseGameOption(new Scanner(input),new PrintWriter(output));
		assertEquals(GameOption.ONEPLAYER, gameOption);
	}
	
	@Test
	public void testChooseIllegalGameOption(){
		GameStarter gameStarter = new GameStarter();
		StringWriter output = new StringWriter();
		String input = "4\n" + "1\n";
		GameOption gameOption = gameStarter.chooseGameOption(new Scanner(input),new PrintWriter(output));
		assertTrue(output.toString().contains("No such option try again.. \n GameOptions \n 1. Player vs Computer \n 2. Player vs Player \n 0. Exit"));
		assertEquals(GameOption.ONEPLAYER, gameOption);
	}

}
