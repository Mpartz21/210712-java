package fixtures;

import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture{
	
	private Map<String,Fixture> exits = new HashMap<>();
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public void setExits(String direction,Room room) {
		exits.put(direction, room);
	}

	public Map<String, Fixture> getExits() {
		return this.exits;
	}
		
	public Fixture getExit(String direction) {
		for(String keyDirection : exits.keySet()) {
			if(keyDirection.startsWith(direction.toLowerCase().intern())) {
				return exits.get(keyDirection);	
			}
		}
		return null;
	}
}
