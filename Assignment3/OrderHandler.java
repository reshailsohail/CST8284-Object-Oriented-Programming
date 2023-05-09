/**
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: April 09 2023
 * Modified: April 09 2023
 * Description: Exception handling with handling multiple catch blocks
 */

import java.io.IOException;

/**
 * OrderHandler class is an example of Java exception handling with multiple catch blocks.
 */
public class OrderHandler {

    /**
     * Main method to demonstrate exception handling with multiple catch blocks.
     */
    public static void main(String[] args) {
        try {
            throw new IOException("Subclass exception occurred.");
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
