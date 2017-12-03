package exceptions;

/**
 * <h1>InvalidVariableNameError</h1>
 * This exception is thrown when variable's name is not correct.
 *
 * @author Szymon Kocur
 *
 */
public class InvalidVariableNameError extends Exception {

	public InvalidVariableNameError() {}

	public InvalidVariableNameError(String message) {
		super(message);
	}
}
