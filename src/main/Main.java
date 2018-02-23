package main;

import java.io.File;
import java.util.*;
import main.exceptions.UnknownExpressionException;
import java.io.FileNotFoundException;

/**
 * <h1>Main</h1>
 * Main class is starter point for Ryss interpreter.
 *
 * @author Szymon Kocur
 */
public class Main {
	private static List<String> expressions = new ArrayList<String>();
	private static List<String> params = new ArrayList<String>();
	private static int line = 0;
    private static String fileName = null;

	/**
	 * This is the main method where scan method starts.
	 * It takes path to a file and save all lines to expressions List.
	 * Interpretation process takes part in separated thread to prevent Ryss Interpreter from 'freezing'.
	 *
	 * @param args Path to file which will be executed/interpreted or
	 * additional debugging parameters.
	 */
	public static void main(String[] args) {
	    splitParameters(args);

	    // To get rid of junk.
	    System.gc();

	    if (fileName != null) {
    		try {
    			File file = new File(fileName);
    			Scanner scanner = new Scanner(file);

    			while (scanner.hasNext()) {
    				expressions.add(scanner.nextLine());
    				line++;
    			}

    			scanner.close();
    		} catch (FileNotFoundException e) {
    			System.out.println("Cannot find .rx file with given name");
    		    System.exit(1);
    		}

            Thread mainThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Interpreter interpreter = new Interpreter.InterpreterBuilder()
                                .commentPattern("//")
                                .build();
                        interpreter.scan(expressions);
                    } catch (UnknownExpressionException e) {
                            System.out.println("Unknown expression at line: " + line);
                    }
                }
            });

            mainThread.start();
	    }
	}

	/**
	 * Simple method which splits Ryss parameters up and which saves file name if String will start with '@'.
	 * It will pass parameters to {@link main.RyssParametersExecutor} in case String starts with '-'.
	 *
	 * @param args Array of Strings initialized during program startup.
	 * @see RyssParametersExecutor
	 */
	private static void splitParameters(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].charAt(0) == '@') {
                fileName = args[i].substring(1);
            } else if (args[i].charAt(0) == '-') {
                params.add(args[i].substring(1));
            } else {
                System.out.println("Invalid parameter format!");
                System.exit(0);
            }
        }

        RyssParametersExecutor rpe = new RyssParametersExecutor(params);
        rpe.executeClass();
	}
}
