package game;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please type in lower case only.");
		RoomManager.init();
		System.out.println("What is your name?");
		
		Player player = new Player(scanner);
		
	}

	private static void printRoom(Player player) {
		
	}
	
	private static String[] collectInput() {
		
		
		return null;
	}
	
	private static void parse(String[] input,Player player) {
		
	}
}
