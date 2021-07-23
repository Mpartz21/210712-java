package fixtures;

import java.util.ArrayList;
import java.util.HashMap;

public class Room extends Fixture{
	
	private HashMap<String,Room> exits = new HashMap<>();
	
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public void setExits(String direction,Room room) {
		exits.put(direction, room);
	}

	public HashMap<String, Room> getExits() {
		return this.exits;
	}
		
	public Room getExit(String direction) {
		return exits.get(direction);	
	}
	
}
