/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: WorldClock
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * 
 * @author Reshail Sohail
 *
 */
public class WorldClock extends Clock {

	public int offset;

	/**
	 * Return current time in the timezone determined by the offset.
	 *
	 * @return Current time as a string in format "hh:mm"
	 */
	@Override
	public String getTime() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
		String timeString = localDateTime.toString();
		int hour = (localDateTime.getHour() + offset);
		if (hour >= 24) {
			hour = 0 + offset;
		}
		return Integer.toString(hour) + ":" + localDateTime.getMinute(); // Extract hours and minutes as a substring
	}

	/**
	 * Returns the current hour between 0-23 and in the timezone specified by the offset.
	 *
	 * @return The current hour is an integer between 0 and 23.
	 */
	@Override
	public int getHours() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
		int hour = (localDateTime.getHour() + offset);
		if (hour >= 24) {
			hour = 0 + offset;
		}
		return localDateTime.getHour() + offset;
	}
	
	/**
	 * Creates WorldClock object with the specific offset.
	 *
	 * @param offset The number of hours to add or subtract from UTC to get the
	 *               desired timezone.
	 */
	public WorldClock(int offset) {
		this.offset = offset;
	}
}