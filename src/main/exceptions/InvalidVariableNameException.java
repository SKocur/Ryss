package main.exceptions;

/**
 * <h1>InvalidVariableNameError</h1>
 * This exception is thrown when variable's name is not correct.
 *
 * @author Szymon Kocur
 *
 */
public class InvalidVariableNameException extends Exception {

	public InvalidVariableNameException() {}

	public InvalidVariableNameException(String message) {
		super(message);
	}
}
