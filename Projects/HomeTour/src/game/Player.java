package game;


import java.util.ArrayList;
import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Item;
import fixtures.Room;

public class Player {
	
	private Room currentRoom;
	private Input playerInput = new Input();
	private ArrayList<Item> Inventory = new ArrayList<Item>();
	
	public Input getPlayerInput() {
		return playerInput;
	}
	public void setPlayerInput(Input playerInput) {
		this.playerInput = playerInput;
	}
	public Player(Room startingRoom){
		this.currentRoom = startingRoom;
	}
	
	public Room getCurrentRoom() {
		return  this.currentRoom;
	}

	public void setCurrentRoom(Room fixture) {
		this.currentRoom =fixture;
	}
}
