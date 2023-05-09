/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: ClockDemo
 */

/**
 * 
 * @author Reshail Sohail
 *
 */
public class ClockDemo {
	public static void main(String[] args) {
		// test Clock
		System.out.println("Testing Clock class");
		Clock clock = new Clock();
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
	}
}