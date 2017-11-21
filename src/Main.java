import java.io.File;
import java.util.*;

import exceptions.UnknownExpressionException;

import java.io.FileNotFoundException;

public class Main {
	static List<String> expressions = new ArrayList<String>();
	static int line = 0;

	public static void main(String[] args) {
		try {
			File file = new File("examples/hello_world.rx");
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext()) {
				expressions.add(scanner.nextLine());
				line++;
			}

			scanner.close();

			Interpreter interpreter = new Interpreter();
			interpreter.scan(expressions);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find .rx file with given name");
		} catch (UnknownExpressionException e) {
			System.out.println("Unknown expression at line: " + line);
		}
	}
}
