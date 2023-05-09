/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: Clock
 */


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Reshail Sohail
 */
public class Clock {
	/**
	 * Formats the string and returns it.
	 *
	 * @return The current time as a string in the format "hh:mm"
	 */
	public String getTime() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		String timeString = localDateTime.toString();
		return timeString.substring(11, 16); // Extract hours and minutes as a substring
	}

	/**
	 * Give the current hour of the day between 0 and 23.
	 *
	 * @return The current hour as an integer between 0 and 23.
	 */
	public int getHours() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		return localDateTime.getHour();
	}

	/**
	 * Returns the current minute.
	 *
	 * @return The current minute as an integer between 0 and 59.
	 */
	public int getMinutes() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		return localDateTime.getMinute();
	}
}

