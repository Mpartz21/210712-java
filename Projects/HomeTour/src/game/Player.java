package game;


import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Room;

public class Player {
	
	private String name;
	private Room currentRoom;
	private Input playerInput = new Input();
	
	public Input getPlayerInput() {
		return playerInput;
	}
	public void setPlayerInput(Input playerInput) {
		this.playerInput = playerInput;
	}
	public Player(Scanner scanner,Room startingRoom){
		System.out.println("What is your name?");
		setName(scanner.next());
		this.currentRoom = startingRoom;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Room getCurrentRoom() {
		return (Room) currentRoom;
	}

	public void setCurrentRoom(Fixture fixture) {
		this.currentRoom = (Room) fixture;
	}
}
