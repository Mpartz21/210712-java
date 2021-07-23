package exceptions;

@SuppressWarnings("serial")
public class ValueDoesNotExistException extends Exception {
	public ValueDoesNotExistException() {
		super("That value does not exists");
	}
}
