package game;

import java.util.ArrayList;

import fixtures.Item;
import fixtures.Room;

public class RoomManager {
	//the room a player should start in
	private Room startingRoom;
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	public void createHouse() {
		//this create house method will create the house essentially
		Room foyer = new Room(
    			"The Foyer",
    			"a small foyer",
    			"");
		rooms.add(foyer);
		setStartingRoom(foyer);
		Room dinning= new Room(
				"The Dinning Room",
				"Short description",
				"Long Description");
		rooms.add(dinning);
		Room piano= new Room(
				"The Piano Room",
				"Short description",
				"Long Description");
		rooms.add(piano);
		Room library= new Room(
				"The Library",
				"Short description",
				"Long Description");
		rooms.add(library);
		Room upStairsMain= new Room(
				"The Up-Stairs Hallway",
				"Short description",
				"Long Description");
		rooms.add(upStairsMain);
		Room masterBedRoom= new Room(
				"The Master Bedroom",
				"Short description",
				"Long Description");
		rooms.add(masterBedRoom);
		Room bathRoom= new Room(
				"The Bathroom",
				"Short description",
				"Long Description");
		rooms.add(bathRoom);
		
		Item book = new Item("The Book","A small book called Clean Code",
				 "It is a book with an image of an interstellar body, "
				+"it looks like a good read");
		Item pianoKeys = new Item("The Bag of Piano Keys","A big bag",
				 "A purple silk bag with a yellow " 
				+"draw string filled with extra piano keys");	
		Item tolietPaper = new Item("The Toliot Paper","Roll of Tolit Paper",
				 "A 4-ply of tolit paper that looks brand new and even has a "
				+"folded triangle at the start");
		
		
		foyer.setExits("north", piano);
		foyer.setExits("west", library);
		foyer.setExits("south", dinning);
		foyer.setExits("up-stairs", upStairsMain);
		
		piano.setExits("south", foyer);
		piano.setExits("west", library);
		piano.addInventory("bag", pianoKeys);
		
		library.setExits("east", foyer);
		library.setExits("north-east", piano);
		library.addInventory("book", book);
		
		dinning.setExits("north", foyer);
		
		upStairsMain.setExits("down-stairs", foyer);
		upStairsMain.setExits("north", bathRoom);
		upStairsMain.setExits("west", masterBedRoom);
		
		masterBedRoom.setExits("east", upStairsMain);
		
		bathRoom.setExits("south", upStairsMain);
		bathRoom.addInventory("TP", tolietPaper);
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
}
