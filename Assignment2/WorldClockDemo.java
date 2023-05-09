/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: WorldClockDemo
 */

/**
 * 
 * @author Reshail Sohail
 *
 */
public class WorldClockDemo {

	public static void main(String[] args) {
		// testing the WorldClock
		System.out.println("Testing WorldClock class");
		int offset = 2;
		System.out.println("Offset: " + offset);
		WorldClock wclock = new WorldClock(offset);
		System.out.println("Hours: " + wclock.getHours());
		System.out.println("Minutes: " + wclock.getMinutes());
		System.out.println("Time: " + wclock.getTime());
	}
}