package game;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.print.PrintException;
import fixtures.Room;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static boolean running = true;
	
	public static void main(String[] args) {

		RoomManager rm = new RoomManager();
		rm.createHouse();
		System.out.println(rm.getStartingRoom().getName());
		System.out.println();
		Player player = new Player(rm.getStartingRoom());
		
		do {
			printExits(player);
			String[] inputCommands = player.getPlayerInput().collectInput(scanner);
			running = player.getPlayerInput().parse(inputCommands, player);
		}while(running);
		System.out.println("Thank you, Come Again");
		scanner.close();
	}
	
	
	
	private static void printExits(Player player) {
		Room currentRoom = player.getCurrentRoom();
		System.out.println("You are in " + player.getCurrentRoom().getName());
		
		HashMap<String, Room> exits = currentRoom.getExits();
		System.out.println("Commands: 'go' and a direction");
		System.out.println("Choose an exit:");
		int i= 0;
		for(Entry<String, Room> exit : exits.entrySet()) {
			i++;
			System.out.println("Go " + exit.getKey() + ": " + exit.getValue().getName());
		}
		System.out.println("quit: quit\n");
	}

}
