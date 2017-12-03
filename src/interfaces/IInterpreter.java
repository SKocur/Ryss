package interfaces;

import java.util.*;
import exceptions.UnknownExpressionException;

/**
 * The IInterpreter inteface provides one method to scan .rx file.
 *
 * @author Szymon Kocur
 *
 */
public interface IInterpreter  {

	/**
	 * This method is required to scan .rx file for known expressions.
	 *
	 * @param expressions String List  - list of expressions
	 * @throws UnknownExpressionException When expression is unknown.
	 * @see UnknownExpressionException
	 */
	public void scan(List<String> expressions) throws UnknownExpressionException;
}
