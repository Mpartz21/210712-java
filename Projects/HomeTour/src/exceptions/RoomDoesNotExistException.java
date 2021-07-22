package exceptions;

public class RoomDoesNotExistException extends Exception {
	public RoomDoesNotExistException() {
		super("That does not exists");
	}
}
