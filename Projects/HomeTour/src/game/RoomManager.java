package game;

import java.util.ArrayList;
import fixtures.Room;

public class RoomManager {
	//the room a player should start in
	private Room startingRoom;
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	public void init() {
		Room foyer = new Room(
    			"The Foyer",
    			"a small foyer",
    			"");
		rooms.add(foyer);
		setStartingRoom(foyer);
		Room dinning= new Room(
				"Dinning Room",
				"Short description",
				"Long Description");
		rooms.add(dinning);
		Room upStairsMain= new Room(
				"Stairs",
				"Short description",
				"Long Description");
		rooms.add(upStairsMain);
		Room piano= new Room(
				"Piano Room",
				"Short description",
				"Long Description");
		rooms.add(piano);
		Room library= new Room(
				"library",
				"Short description",
				"Long Description");
		rooms.add(library);
		foyer.setExits("north", piano);
		foyer.setExits("west", library);
		foyer.setExits("south", dinning);
		foyer.setExits("up-stairs", upStairsMain);
		piano.setExits("south", foyer);
		library.setExits("east", foyer);
		dinning.setExits("north", foyer);     
	}

	public  Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

}
