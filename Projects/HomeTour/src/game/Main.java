package game;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.print.PrintException;

import fixtures.Item;
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
		
		HashMap<String, Room> exits = currentRoom.getExits();
		
		System.out.println("You are in " + player.getCurrentRoom().getName());
		System.out.println("Commands: 'go' direction\n"
						  +"'pick-up' item\n"
						  +"'quit'");
		System.out.println("Choose an exit:");
		
		for(Entry<String, Room> exit : exits.entrySet()) {
			System.out.println("go " + exit.getKey() + ": " + exit.getValue().getName());
		}
		printItemsInRoom(player.getCurrentRoom());
		System.out.println("quit: quit\n");
	}
	private static void printItemsInRoom(Room currentRoom) {
		HashMap<String, Item> roomInventory = currentRoom.getInventory();
		if(currentRoom.getInventory().size() > 0) {
			System.out.println("Items in the room to pick-up");
			for(Entry<String,Item> item :roomInventory.entrySet()) {
				System.out.println("pick-up "+ item.getKey());
			}
		}
	}

}
