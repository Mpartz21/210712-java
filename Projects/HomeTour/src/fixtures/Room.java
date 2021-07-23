package fixtures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture{
	
	private HashMap<String,Room> exits = new HashMap<>();
	
	private HashMap<String,Item> inventory = new HashMap<>();
	
	public HashMap<String, Item> getInventory() {
		return inventory;
	}

	public void addInventory(String key,Item item) {
		inventory.put(key, item);
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
