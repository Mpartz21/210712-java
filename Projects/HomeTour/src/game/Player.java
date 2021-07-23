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
	
	public Item getItemFromInventory(String name) {
		for(Item item: Inventory) {
			if(name.toLowerCase() == item.getName().toLowerCase()) {
				return item;
			}
		}
		return null;
	}
	
	public ArrayList<Item> getInventory() {
		return Inventory;
	}
	public Room getCurrentRoom() {
		return  this.currentRoom;
	}

	public void setCurrentRoom(Room fixture) {
		this.currentRoom =fixture;
	}
}
