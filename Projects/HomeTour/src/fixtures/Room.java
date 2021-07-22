package fixtures;

import java.util.HashMap;

public class Room extends Fixture{
	
	private HashMap<String,Room> exits = new HashMap<>();
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public void setExits(String direction,Room room) {
		exits.put(direction, room);
	}

	public HashMap<String, Room> getExits() {
		return this.exits;
	}
		
	public Fixture getExit(String direction) {
		return exits.get(direction);	
	}
}
