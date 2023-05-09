/*
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 * Description: This class takes the data of a patient and provides them with their BMI.
 */



import java.time.LocalDate;
import java.util.Scanner;

public class MyHealthDataTest {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Get patient information from user
    System.out.println("Enter patient information:");
    System.out.print("First Name: ");
    String firstName = input.nextLine();
    System.out.print("Last Name: ");
    String lastName = input.nextLine();
    System.out.print("Gender: ");
    String gender = input.nextLine();
    System.out.print("Height (in): ");
    double heightInches = input.nextDouble();
    System.out.print("Weight (lbs): ");
    double weightPounds = input.nextDouble();
    System.out.print("Date of Birth (YYYY-MM-DD): ");
 
    
    String dateOfBirthStr = input.next();

    LocalDate dateOfBirth = null;
    try {
        dateOfBirth = LocalDate.parse(dateOfBirthStr);
    } catch (Exception e) {
        System.out.println("Invalid date format. Please enter date in format YYYY-MM-DD.");
        return;
    }
    // Create new patient object
    Patient patient = new Patient(firstName, lastName, gender, dateOfBirth.getYear(), dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth(), heightInches, weightPounds);

    // Display patient information
    System.out.println();
    patient.displayMyHealthData();

    input.close();
}
} // end class MyHealthDataTest