package fixtures;

import java.util.ArrayList;

public class Door extends Fixture{
	private boolean open;
	
	ArrayList<Room> connectingRooms = new ArrayList<>(); 

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Door(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

}
