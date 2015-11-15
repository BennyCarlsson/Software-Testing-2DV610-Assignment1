package game;

import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.runners.MethodSorters;

public class GameStarter {

	public static void main(String[] args) {
		
	}

	public int testFunctiongetSum(int i, int j) {
		int value = i+j;
		return value;
	}

	public int test2() {
		//super advanced calculation
		int value = 1 + 1;
		return value;
	}
	
	public GameOption chooseGameOption() {
		return chooseGameOption(new Scanner(System.in),new PrintWriter(System.out));
	}
	public GameOption chooseGameOption(Scanner scanner, PrintWriter output) {
		// TODO Auto-generated method stub
		return null;
	}
}
