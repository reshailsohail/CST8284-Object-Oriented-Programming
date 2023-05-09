/*
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Due date: Jan 20,2023
 * Modified: Jan 21, 2023
 * Description: This class represents main method that will get user input to generate
 * a username.
 */


/**
 * 
 * @author Reshail Sohail
 *
 *
 */



import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    	/**
    	 * Creates scanner to get input from user.
    	 */
        Scanner input = new Scanner(System.in);
        
        /**
         * This creates an object from Username.
         */
        Username name = new Username();

        /**
         * This outputs a message for the user to enter their first name. It also sets
         * the first name entered using String fName.
         */
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();
        name.setfName(fName);
        /**
         * This outputs a message for the user to enter their last name. It also sets
         * the last name entered using String lName.
         */
        System.out.print("Enter your last name: ");
        String lName = input.nextLine();
        name.setlName(lName);
        /**
         * This outputs a message for the user to enter their student number. It also sets
         * the student number entered using long studentNumber.
         */
        System.out.print("Enter your student number: ");
        long studentNumber = input.nextLong();
        name.setStudentNumber(studentNumber);
        /**
         * Report variable create to print results of username after users input.
         */
        String report;
        report = name.generateUsername();
        
        /**
         * Report variable prints username.
         */
        
        System.out.println(report);
        System.out.println("Program by Reshail Sohail");
    }
    
    
}
