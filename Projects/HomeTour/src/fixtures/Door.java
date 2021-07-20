package fixtures;

import java.util.ArrayList;

public class Door extends Fixture{
	private boolean open;
	private Room room;
	

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Door(String name, String shortDescription, String longDescription, Room room) {
		super(name, shortDescription, longDescription);
		setRoom(room);
		// TODO Auto-generated constructor stub
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
