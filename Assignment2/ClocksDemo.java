/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: ClocksDemo
 */


/**
 * A program that demonstrates the use of the Clock, WorldClock, and AlarmClock classes.
 * The program creates objects of these classes, sets an alarm using the AlarmClock class, 
 * and prints the current time for each clock.
 * 
 * @author Reshail Sohail
 */
public class ClocksDemo {
	public static void main(String[] args) {
		// Create Clock, WorldClock, and AlarmClock objects
		Clock clock = new Clock();
		WorldClock worldClock = new WorldClock(5);
		AlarmClock alarmClock = new AlarmClock();
		alarmClock.setAlarm(15,05 ); // Set an alarm for 13:54

		// Create an array of Clock objects containing the above objects
		Clock[] clocks = { clock, worldClock, alarmClock };

		// Print current time for every clock
		for (int i = 0; i < clocks.length; i++) {
			System.out.println(clocks[i].getTime());
		}
	}
}
