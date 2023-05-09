/**
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: April 09 2023
 * Modified: April 09 2023
 * Description: Exception handling with different classes
 */


import java.io.IOException;

/**
 * DogHandler class is an example of Java exception handling with different exception classes.
 */
public class DogHandler {

    /**
     * Main method to demonstrate exception handling with different exception types.
     */
    public static void main(String[] args) {

        try {
            throw new ExceptionDog(); // Throw ExceptionDog
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            throw new ExceptionPuppy(); // Throw ExceptionPuppy
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            throw new NullPointerException(); // Throw NullPointerException
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            throw new IOException(); // Throw IOException
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }

    /**
     * ExceptionDog is an inner class that extends the base Exception class.
     */
    static class ExceptionDog extends Exception {
    }

    /**
     * ExceptionPuppy is an inner class that extends ExceptionDog.
     */
    static class ExceptionPuppy extends ExceptionDog {
    }
}
