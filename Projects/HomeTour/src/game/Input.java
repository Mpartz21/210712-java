package game;

import java.util.Scanner;

import fixtures.Fixture;
import exceptions.RoomDoesNotExistException;
import exceptions.IncorrectInputCommandsException;

public class Input {
	
	public String[] collectInput(Scanner scanner) {
		String[] inputCommands;
		try {
			String input = scanner.nextLine();
			inputCommands = input.split(" ");
			return inputCommands;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	private void checkIfFixtureExisits(String[] inputCommands, Player player) throws 
	RoomDoesNotExistException{
		Fixture exists = player.getCurrentRoom().getExit(inputCommands[1]);
		if(exists == null) 
			throw new RoomDoesNotExistException();
	}
	
	public boolean parse(String [] inputCommands, Player player){
		try {
			switch(inputCommands[0].toLowerCase()) {
			
			case("go"):
				goCommand(inputCommands, player);
			return true;
			case("quit"):
				System.out.println("Quitting");
			return false;
			default:
//				throw new IncorrectInputCommandsException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return true;
	}
	
	public void goCommand(String [] inputCommands, Player player) {
		try {
			checkIfFixtureExisits(inputCommands, player);
			player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
			System.out.println(player.getCurrentRoom().getName());
		} catch (RoomDoesNotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			System.out.println("Going to " + player.getCurrentRoom().getExit();
		}
	}
	
	public void quitCommand() {
		
	}
}
