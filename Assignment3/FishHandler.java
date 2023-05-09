/**
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: April 09 2023
 * Modified: April 09 2023
 * Description: Exception handling with rethrowing exceptions
 */


/**
 * FishHandler class is an example of Java exception handling with rethrowing exceptions.
 */
public class FishHandler {

    /**
     * Main method to demonstrate exception handling with rethrowing exceptions.
     */
    public static void main(String[] args) {
        try {
            easterStarting();
        } catch (Exception e) {
            System.err.println("Caught rethrown exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Method represents an exception in a nested method call and rethrows the exception.
     */
    public static void easterStarting() {
        try {
            easterEnding();
        } catch (Exception e) {
            System.err.println("Caught exception in easterStarting: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }

    /**
     * easterEnding method throws a custom exception and catches it to display the error message and stack trace.
     */
    public static void easterEnding() {
        try {
            throw new Exception("Exception occurred in easterEnding.");
        } catch (Exception e) {
            System.err.println("Caught exception in easterEnding: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
