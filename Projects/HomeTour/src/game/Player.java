package game;


import java.util.Scanner;

import fixtures.Room;

public class Player {
	
	private String name;
	private Room currentRoom;

	
	public Player(Scanner scanner){
		setName(scanner.next());
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
