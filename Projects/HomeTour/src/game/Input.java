package game;

import java.util.Scanner;

import fixtures.Fixture;
import exceptions.RoomDoesNotExistException;

public class Input {
	
	public String[] collectInput(Scanner scanner) {
		String[] inputCommands;
		try {
			String input = scanner.nextLine();
			System.out.println(input);
			inputCommands = input.split(" ");
			return inputCommands;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	private void checkIfFixtureExisits(String input, Player player) throws 
	RoomDoesNotExistException{
		Fixture exists = player.getCurrentRoom().getExit(input);
		if(exists == null) 
			throw new RoomDoesNotExistException();
	}
	

	public boolean parse(String[] inputCommands, Player player){
		try {
			switch(inputCommands[0].toLowerCase()) {
			
			case("go"):
				goCommand(inputCommands[1], player);
//			System.out.println("Going to " + player.getCurrentRoom().getExit(inputCommands[1]).getName());

				return true;
			
			case("quit"):
//				System.out.println("Quitting");
				return false;

			default:
				System.out.println("Please try again");
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed giving that command\n"
					  +"Try Again ");
			return true;
		}
		return true;
	}
	
	private void goCommand(String input, Player player) {
		try {
			checkIfFixtureExisits(input, player);
			player.setCurrentRoom(player.getCurrentRoom().getExit(input));
		} catch (RoomDoesNotExistException e) {
			// TODO Auto-generated catch block
			e.addSuppressed(e);
		}
		
	}
	
	
}
