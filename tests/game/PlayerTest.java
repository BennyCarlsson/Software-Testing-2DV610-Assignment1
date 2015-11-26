package game;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	Player _player;
	@Before
	public void setUp() throws Exception {
		_player = new Player();
	}

	@Test
	public void testPlayerInput() {
		String input = "1a";
	    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    assertEquals("1a", _player.playerInput());
	}

}
