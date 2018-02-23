package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for executing parameters passed
 * during Ryss script startup.
 *
 * @author Szymon Kocur
 */
public class RyssParametersExecutor {
    private List<String> params = new ArrayList<String>();

    public RyssParametersExecutor(List<String> params) {
        this.params = params;
    }

    /**
     * Method, which splits parameters saved in format "class:method" and
     * executes given methods from inner classes.
     *
     * @see Verbose
     */
    public void executeClass() {
        for (String param : params) {
            String[] paramDetails = param.split(":");

            switch (paramDetails[0]) {
                case "verbose":
                    Verbose verbose = new Verbose(paramDetails[1]);
                    verbose.executeMethod();
                    break;
                default:
                    System.out.println("Invalid parameter!");
                    System.exit(0);
            }
        }

    }

    /**
     * Class responsible for displaying environmental information about
     * Ryss interpreter and JVM.
     *
     * @author Szymon Kocur
     */
    private class Verbose {
        String method;

        public Verbose(String method) {
            this.method = method;
        }

        /**
         * Prints out information associated with method passed as a String variable.
         */
        public void executeMethod() {
            switch (method) {
                case "avmemory":
                    System.out.println("Available memory: " + Runtime.getRuntime().freeMemory());
                    break;
                case "maxmemory":
                    System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
                    break;
                default:
                    System.out.println("Unknown method invocation.");
                    System.exit(0);
            }
        }
    }
}
