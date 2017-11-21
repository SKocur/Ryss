package interfaces;
import java.util.*;

import exceptions.UnknownExpressionException;

public interface IInterpreter  {
	public void scan(List<String> expressions) throws UnknownExpressionException;
}
