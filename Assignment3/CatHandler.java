/**
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: April 09 2023
 * Modified: April 09 2023
 * Description: Exception handling with different classes
 */


/**
 * CatHandler class is an example of Java exception handling with multiple different exception classes.
 */
public class CatHandler {

    /**
     * Main method to demonstrate exception handling with different exception classes.
     */
    public static void main(String[] args) {

        try {
            throw new ExceptionBeta(); // Throw ExceptionBeta
        } catch (ExceptionAlpha ea) {
            System.err.println("Exception caught: " + ea.getMessage());
        }

        try {
            throw new ExceptionGammer(); // Throw ExceptionGammer
        } catch (ExceptionAlpha ea) {
            System.err.println("Exception caught: " + ea.getMessage());
        }
    }

    /**
     * ExceptionAlpha is an inner class that extends the base Exception class.
     */
    static class ExceptionAlpha extends Exception {
    }

    /**
     * ExceptionBeta is an inner class that extends ExceptionAlpha.
     */
    static class ExceptionBeta extends ExceptionAlpha {
    }

    /**
     * ExceptionGammer is an inner class that extends ExceptionBeta.
     */
    static class ExceptionGammer extends ExceptionBeta {
    }
}
