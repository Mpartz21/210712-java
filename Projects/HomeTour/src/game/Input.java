package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Item;
import fixtures.Room;
import exceptions.ValueDoesNotExistException;

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
	ValueDoesNotExistException{
		Room exists = player.getCurrentRoom().getExit(input);
		if(exists == null) 
			throw new ValueDoesNotExistException();
	}
	

	public boolean parse(String[] inputCommands, Player player){
		try {
			switch(inputCommands[0].toLowerCase()) {
			
			case("go"):
				goCommand(inputCommands[1], player);
//			System.out.println("Going to " + player.getCurrentRoom().getExit(inputCommands[1]).getName());
				return true;
			
			case("pick-up"):
				pick_upCommand(inputCommands[1], player);
				return true;
				
			case("inspect"):
				inspectCommand();
				
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
	
	private void inspectCommand() {
		// TODO Auto-generated method stub
		
	}

	private void pick_upCommand(String input,Player player) {
		try {
			checiIfItemExisits(input,player);
			player.getInventory().add(player.getCurrentRoom().getInventory().get(input));
			player.getCurrentRoom().getInventory().remove(input);
		}catch (ValueDoesNotExistException e) {
			// TODO: handle exception
			e.addSuppressed(e);
		}
		
	}

	private void checiIfItemExisits(String input, Player player) throws ValueDoesNotExistException {
		Item exists = player.getCurrentRoom().getInventory().get(input);
		if(exists == null) 
			throw new ValueDoesNotExistException();
	}

	private void goCommand(String input, Player player) {
		try {
			checkIfFixtureExisits(input, player);
			player.setCurrentRoom(player.getCurrentRoom().getExit(input));
		} catch (ValueDoesNotExistException e) {
			// TODO Auto-generated catch block
			e.addSuppressed(e);
		}
		
	}
	
	
}
