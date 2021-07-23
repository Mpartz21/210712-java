package exceptions;

@SuppressWarnings("serial")
public class RoomDoesNotExistException extends Exception {
	public RoomDoesNotExistException() {
		super("That does not exists");
	}
}
