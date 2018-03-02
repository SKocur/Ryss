package main.exceptions;

/**
 * <h1>UnknownExpressionException</h1>
 * This exception is thrown when expression is unknown.
 *
 * @author Szymon Kocur
 *
 */
public class UnknownExpressionException extends Exception {

	public UnknownExpressionException() {}

	public UnknownExpressionException(String message){
		super(message);
	}
}
